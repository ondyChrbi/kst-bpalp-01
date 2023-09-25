package cz.upce.fei.bpalp.cv01;

/*
 * aplikace pro vypocet obvodu trojuhelniku bez uzivatelskeho vstupu
 *
 * */
public class TrojuhelnikKalkulackaApp {
    public static void main(String[] args) {
        // definovani promennych pro jednotlive strany trojuhelniku
        int stranaA = 5;
        int stranaB = 5;
        int stranaC = 7;

        // vypocet obvodu podle vzorce O = a + b + c
        int obvod = stranaA + stranaB + stranaC;

        // vypis vysledku
        System.out.println("Obvod trojuhelniku je " + obvod);
    }
}
