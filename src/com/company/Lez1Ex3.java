package com.company;

import java.util.*;

/**
 * Created by Danilo on 17/09/2015.
 * [TrePiùGrandi]
 * Scrivere un programma che legge una serie di numeri interi positivi
 * (la lettura si interrompe quando è letto un numero negativo) e stampa i tre numeri più grandi della serie.
 * Ad esempio, se la serie di numeri è 2,10,8,7,1,12,2 allora il programma stampa:

 I tre numeri più grandi sono: 12, 10, 8
 */
public class Lez1Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digita dei numeri interi:");
        ArrayList<Integer> Numeri = new ArrayList<Integer>(){};

        while ( true ){
            int s = in.nextInt();
            if (s < 0) {
                break;
            }
            Numeri.add(s);
        }
        Collections.reverse(Numeri);
        System.out.println("I tre numeri piu' grandi sono: " + Numeri.get(0) + ", " + Numeri.get(1) + ", " + Numeri.get(2));

    }
}
