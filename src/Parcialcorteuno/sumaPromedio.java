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
public class sumaPromedio {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in); 
        System.out.println("Ingrese tamaño vector");
        
        int num = sc.nextInt();
        
        int[] vector = new int[num];
        int suma = 0 ;
                
        for (int i=0; i< vector.length; i++){
            System.out.print("Ingrese el elemento " + i + ": ");
            vector[i] = sc.nextInt();
            suma = suma + vector[i];
        }
        double promedio = (double) suma / vector.length;
        
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
    
}
