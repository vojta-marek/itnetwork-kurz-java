/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.mainevidence;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Třída reprezentuje evidenci, která eviduje jednotlivé pojištěnce
 * @author vojta
 */
public class Evidence {
    /**
     * Kolekce pro ukládání pojištěnců
     */
    private ArrayList<Pojistenec> databaze;
    /**
     * Zobrazuje dnešní datum
     */
    private LocalDate aktualniDatum = LocalDate.now();
    /**
     * Konstruktor v jehož těle probíhá inicializace kolekce dazabaze
     */
    public Evidence() {
        databaze = new ArrayList<>();
    }
    
    /**
     * Metoda do níž vyplní uživatel údaje o pojištěnci a ona ho zaeviduje do kolekce
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telefonniCislo
     */
    public void pridejPojistence(String jmeno, String prijmeni, int vek, int telefonniCislo) {
        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telefonniCislo);
        databaze.add(pojistenec);
        System.out.println("Data byla uložena.");
    }
    
    /**
     * Metoda vypíše všechny pojištěnce v kolekci
     */
    public void vypisPojistence() {
        System.out.println();
        System.out.println("Výpis všech evidovaných pojištěnců:");
        System.out.println();
        
        for(Pojistenec pojistenec : databaze) {
            System.out.println(pojistenec);
        }
    }
    
    /**
     * Metoda vyhledá pojištěnce v kolekci podle zadaného jména a příjmení uživatelem
     * @param jmenoHledaneho
     * @param prijmeniHledaneho
     */
    public void vyhledejPojistence(String jmenoHledaneho, String prijmeniHledaneho) {
            boolean existuje = false;
            System.out.println();
            System.out.println("Výsledek/ky hledání:");
            System.out.println();
            
            for(Pojistenec pojistenec : databaze) {
                if ((pojistenec.getJmeno().contains(jmenoHledaneho)) && (pojistenec.getPrijmeni().contains(prijmeniHledaneho))) {
                    System.out.println(pojistenec);
                    existuje = true;
                }
            } if (existuje == false) {
                System.out.println(jmenoHledaneho + " " + prijmeniHledaneho + " bohužel v evidenci není..");
            }
            System.out.println();
    }
    
    /**
     * Metoda vypíše úvodní text evidence a zobrazí dnešní datum
     */
    public void vytvorUvod() {
        System.out.println("----------------------------------");
        System.out.println("Vítejte v evidenci pojištěnců");
        System.out.println("----------------------------------");
        System.out.println("Dnešní datum: " + aktualniDatum.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println();
    }
}
