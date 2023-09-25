package cz.upce.fei.bpalp.cv01;

import java.util.Scanner;

/*
 * aplikace pro vypocet obsahu trojuhelniku (predpoklada se obecny trojuhelnik)
 *
 * */
public class ObsahTrojuhelnikuApp {
    public static void main(String[] args) {
        // definování scanneru pro nacteni vstupu z konzole
        Scanner scanner = new Scanner(System.in);

        // nacteni potrebnych vstupu od uzivatele a ulozeni do promennych
        System.out.print("Zadej vysku: ");
        int vyska = scanner.nextInt();
        
        System.out.print("Zadej zakladnu: ");
        int zakladna = scanner.nextInt();

        // vypocet podle vzorce S = (1/2) * v * b
        double obsah = 0.5 * vyska * zakladna;

        // vypis vysledku
        System.out.println("Obsah trojuhelniku je " + obsah);
    }
}
