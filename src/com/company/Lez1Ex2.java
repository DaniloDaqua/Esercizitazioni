package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Danilo on 16/09/2015.
 * [Vocali]
 * Scrivere un programma che legge una linea di testo e per ogni vocale stampa
 * il numero di volte che appare nella linea di testo.
 * Ad esempio, se la linea di testo è "mi illumino di immenso" allora il programma stampa:

 a: 0    e: 1    i: 5    o: 2    u: 1
 */
public class Lez1Ex2 {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Digita una frase:");
        String s = in.nextLine();

        s = s.replace(" ", "");
        String[] vocali = {"a","e","i","o","u"};

       for (int i = 0; i < vocali.length; i++) {
           int contatore = 0;
           for (int t = 0; t <s.length(); t++){
               if (vocali[i].equals(Character.toString(s.charAt(t)))) {
                   contatore += 1;
               }
           }
           System.out.print(vocali[i]+": "+contatore+"   ");
       }
    }
}
