/*
 * Ejercicio 4. Contar pares e impares
 */
package Parcialcorteuno;

import java.util.Scanner;

/**
 *
 * @author cordo
 */
public class Contarpareimpar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño del vector: ");
        int num = sc.nextInt();
        
        int[] vector = new int [num];
        
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el elemento " + i + ": ");
            vector[i] = sc.nextInt();
            
            if (vector[i] % 2 == 0) {
                pares++;
            }else {
                impares++;
            }
        }
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
    
}
