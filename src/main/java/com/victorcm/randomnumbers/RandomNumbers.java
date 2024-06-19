package com.victorcm.randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int DESDE;
        int HASTA;
        int VALORES;
               
        System.out.println("Introduce un número de inicio: ");
        DESDE = sc.nextInt();
        System.out.println("Introduce un número final: ");
        HASTA = sc.nextInt();
        System.out.println("Introduce un número de valores: ");
        VALORES = sc.nextInt();     
        
        int [] random = new int [VALORES];
        
        for (int i = 0; i < random.length; i++) {
            random [i] = rnd.nextInt(HASTA - DESDE + 1) + DESDE;
        }
        
        for (int i = 0; i < random.length; i++) {
            System.out.println("Posición " + (i + 1) + ": " + random[i]);
        }
    }
}
