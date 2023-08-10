/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.mainevidence;

/**
 * Třída reprezentuje pojištěnce, kterého evidujeme v evidenci
 * @author vojta
 */
public class Pojistenec {
    /**
     * Jméno pojištěnce
     */
    private String jmeno;
    /**
     * Přijmení pojištěnce
     */
    private String prijmeni;
    /**
     * Věk pojištěnce
     */
    private int vek;
    /**
     * Telefonní číslo pojištěnce
     */
    private int telefonniCislo;
    
    /**
     * Konstruktor vracející hodnoty jednotlivých atributů v parametru
     * @param jmeno pojištěnce
     * @param prijmeni pojištěnce
     * @param vek pojištěnce
     * @param telefonniCislo pojištěnce
     */
    public Pojistenec (String jmeno, String prijmeni, int vek, int telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    private void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    private void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @param vek the vek to set
     */
    private void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * @return the telefonniCislo
     */
    public int getTelefonniCislo() {
        return telefonniCislo;
    }

    /**
     * @param telefonniCislo the telefonniCislo to set
     */
    private void setTelefonniCislo(int telefonniCislo) {
        this.telefonniCislo = telefonniCislo;
    }
    
    /**
     * @return Metoda vrací textový formát pojištěnce
     */
    @Override
    public String toString() {
        return String.format("%s %s %d let, tel.: %d", jmeno, prijmeni, vek, telefonniCislo);
    }
}
