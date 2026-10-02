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
public class puntoDos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int num = sc.nextInt();
        
        int[] vector = new int[num];
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese el elemento " + i + ": ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Elementos del vector:");
        for (int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
}
