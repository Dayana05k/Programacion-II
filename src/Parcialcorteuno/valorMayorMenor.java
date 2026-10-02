/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcialcorteuno;

import java.util.Scanner;

/**
 *
 * @author cordo
 */
public class valorMayorMenor {
    
    public static void main(String[] args ){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese el elemento " + i + ": ");
            vector[i] = sc.nextInt();
            
            int mayor = vector[0];
            int menor = vector[0];
            
            for (int i = 1; i < vector.length; i++){
                if (vector[i] > mayor){
                    mayor = vector[i];
                }
                if (vector[i] < menor){
                    menor = vector[i];
                }
            }
            System.out.println("El valor mayor es: " + mayor);
            System.out.println("El valor menor es: " + menor);
        }
        
    }
    
}
