/*
 * Ejercicio 1. Leer y mostrar una matriz
 */
package Parcialcorteuno;

import java.util.Scanner;

/**
 *
 * @author cordo
 */
public class matrizUno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz:");
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
