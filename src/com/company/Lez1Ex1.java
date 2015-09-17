package com.company;

import java.util.Scanner;

/**
 * Created by Danilo on 16/09/2015.
 * [StringheVerticali]
 * Scrivere un programma che legge tre stringhe e le stampa in verticale l'una accanto all'altra.
 * Ad esempio, se le stringhe sono "gioco", "OCA" e "casa" allora il programma stampa:

 gOc
 iCa
 oAs
 c a
 o
 */
public class Lez1Ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digita tre parole:");
        String s0 = in.nextLine();
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        int forseMax = Math.max(s0.length(), s1.length());
        int SicuroMax = Math.max(forseMax, s2.length());


        for (int i = 0; i < SicuroMax; i++) {
            if (s0.length() < SicuroMax) {
                s0 = s0 + " ";
            }
            if (s1.length() < SicuroMax) {
                s1 = s1 + " ";
            }
            if (s2.length() < SicuroMax) {
                s2 = s2 + " ";
            }
            System.out.print(s0.charAt(i));
            System.out.print(s1.charAt(i));
            System.out.print(s2.charAt(i));
            System.out.println();
        }
    }
}