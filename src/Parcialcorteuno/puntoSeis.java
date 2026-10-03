/*
 * Ejercicio 6. Invertir el vector
 */
package Parcialcorteuno;

import java.util.Scanner;

/**
 *
 * @author cordo
 */
public class puntoSeis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese el elemento " + i + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Vector original:");
        
        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.println("Vector en orden inverso:");
        for (int i = vector.length - 1; i >= 0; i--){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
}
