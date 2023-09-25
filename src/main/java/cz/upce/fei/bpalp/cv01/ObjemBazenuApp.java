package cz.upce.fei.bpalp.cv01;

import java.util.Scanner;

/*
 * Aplikace pro vypocet objemu bazenu (predpoklada se ze bazen ma tvar kvadru)
 *
 * */
public class ObjemBazenuApp {
    public static void main(String[] args) {
        // definování scanneru pro nacteni vstupu z konzole
        Scanner scanner = new Scanner(System.in);

        // nacteni potrebnych vstupu od uzivatele a ulozeni do promennych
        System.out.print("Zadejte delku bazenu: ");
        double delka = scanner.nextDouble();
        
        System.out.print("Zadejte sirku bazenu: ");
        double sirka = scanner.nextDouble();
        
        System.out.print("Zadejte hloubku bazenu: ");
        double hloubka = scanner.nextDouble();

        // vypocet objemu podle vzorce V = a * b * c
        double objem = delka * sirka * hloubka;

        // vypis vysledku na dve desetinna mista
        System.out.printf("Objem bazenu je: %.2f m3", objem);
    }
}
