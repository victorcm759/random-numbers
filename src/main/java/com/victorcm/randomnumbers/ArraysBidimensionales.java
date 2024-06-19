package com.victorcm.randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class ArraysBidimensionales {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int DESDE;
        int HASTA;
        int VALORES_I;
        int VALORES_J;
               
        System.out.println("Introduce un número de inicio: ");
        DESDE = sc.nextInt();
        System.out.println("Introduce un número final: ");
        HASTA = sc.nextInt();
        System.out.println("Introduce un número de valores de I: ");
        VALORES_I = sc.nextInt();
        System.out.println("Introduce un número de valores de J: ");
        VALORES_J = sc.nextInt();
        
        int [][] random = new int [VALORES_I] [VALORES_J];
        
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                random[i][j] = rnd.nextInt(HASTA - DESDE + 1) + DESDE;
            }
        }
        
        System.out.println("LISTADO DE NÚMEROS");
        System.out.println("Números generados en total: " + (VALORES_I * VALORES_J));
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {
                if (j == random[i].length - 1) {
                    System.out.print(random[i][j] + "\n");
                } else {
                    System.out.print(random[i][j] + "\t");
                }
            }
        }
    }
    
}
