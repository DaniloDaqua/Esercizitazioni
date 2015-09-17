package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Danilo on 17/09/2015.
 * [GraficoABarre]
 * Scrivere un programma che legge un intero n e poi legge una sequenza
 * di n interi positivi e stampa un grafico a barre della sequenza.
 * Ad esempio, se la sequenza è 2, 5, 1, 3, 7, 5, 4 allora il programma stampa:

 *
 *
 *  **
 *  ***
 * ****
 ** ****
 *******
 */
public class Lez2Ex1 {
    public static void main(String[] args) {

        ArrayList<String> ListSpAst = GestioneSpazi(GestioneInput());

        // stampiamo ->
        for (int i = 0; i < ListSpAst.get(0).length(); i++) {
            for (int e = 0; e < ListSpAst.size(); e++) {
                String parola = ListSpAst.get(e);
                System.out.print(parola.charAt(i));
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> GestioneInput() {
    //gestiste lunghezza della sequenza e ne ritorna la sequenza
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ListNumbers = new ArrayList<>();

        System.out.println("Scriva un numero che indichi la lunghezza della squenza:");

        int n = in.nextInt();
        if (n < 0){
            return new ArrayList<Integer>();
        }
        System.out.println("Scrivi la squenza di numeri:");
        for (int i = 0; i < n; i++){
            int input = in.nextInt();
            ListNumbers.add(input);
        }
        return ListNumbers;
    }
    public static ArrayList<String> GestioneSpazi(ArrayList<Integer> lista) {
    //inserisce spazi e asterischi
        int max = Collections.max(lista);
        //System.out.println(max);
        ArrayList<String> listastring = new ArrayList<String>();
        for (Integer i : lista){
            String aste = String.join("", Collections.nCopies(i, "*"));
            String spazi = String.join("", Collections.nCopies(max-i, " "));
            listastring.add(spazi+aste);
        }
        //System.out.println(listastring);
        return listastring;
    }
}
