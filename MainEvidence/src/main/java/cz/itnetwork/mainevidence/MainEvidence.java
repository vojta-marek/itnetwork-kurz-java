/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.mainevidence;

import java.util.Scanner;

/**
 * Třída obsluhuje vstupy uživatele a nabízí instanci evidence, na které volá zvolené metody (1-4)
 * @author vojta
 */
public class MainEvidence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        Evidence evidence = new Evidence();
        int vyber = 0;
        evidence.vytvorUvod();
        
        while(vyber != 4) {
            vyber = 0;
            System.out.println("----------------------");
            System.out.println("EVIDENCE POJIŠTĚNÝCH");
            System.out.println("----------------------");
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            
        // Zajistí aby šlo zadat pouze akci 1-4 a při jiných vstupních hodnotách aplikace nespadla
        while ((vyber < 1) || (vyber > 4)) {
            try {
                vyber = Integer.parseInt(scanner.nextLine());
            } catch (Exception ex) {
            }
            if ((vyber < 1) || (vyber > 4)) {
                System.out.println("Zadaná hodnota musí být číslo v rozsahu 1-4, zkuste to znovu..");
            }
            }
        
        // Vykoná zvolený úkon (1-4) na základně vstupu uživatele
        switch (vyber) {
            case 1:
                System.out.println("Zadejte jméno pojištěného:");
                String jmeno = scanner.nextLine().trim();
        
                System.out.println("Zadejte přijmení:");
                String prijmeni = scanner.nextLine().trim();
                
                boolean pokracovat = false;
                while (pokracovat == false) {
                    // Vychytá chybné zadání textového řetězce místo číselné hodnoty
                    try {
                            System.out.println("Zadejte věk:");
                            int vek = Integer.parseInt(scanner.nextLine().trim());
                            pokracovat = true;
                            boolean pokracovatTelefon = false;
                                while (pokracovatTelefon == false) {
                                    try {
                                        System.out.println("Zadejte telefonní číslo:");
                                        int telefonniCislo = Integer.parseInt(scanner.nextLine().trim());
                                        evidence.pridejPojistence(jmeno, prijmeni, vek, telefonniCislo);
                                        pokracovatTelefon = true;
                                    } catch (Exception ex) {
                                        System.out.println("Telefonní číslo musí být v číselném formátu, zkuste to znovu..");
                                    }
                            }
                    } catch (Exception ex) {
                        System.out.println("Věk musí být v číselném formátu, zkuste to znovu..");                       
                    }
                }
                
            break;
            
            case 2:
                evidence.vypisPojistence();
            break;
            
            case 3:
                System.out.println("Zadejte jméno hledaného pojištěného:");
                String jmenoHledaneho = scanner.nextLine().trim();
                System.out.println("Zadejte přijmení:");
                String prijmeniHledaneho = scanner.nextLine().trim();
                
                evidence.vyhledejPojistence(jmenoHledaneho, prijmeniHledaneho);
                    
            break;  
            
            default:
            break;
        }
        
        // Zajistí pokračování stisknutím libovolné klávesy, pokud nebyla aplikace ukončena
        if (vyber != 4) {
            System.out.println();
            System.out.println("Pro pokračování stiskněte klávesu \"ENTER\"");
            String klavesa = scanner.nextLine();
        } else {
            System.out.println("Aplikace byla ukončena..");
        }
        }
    }
}
