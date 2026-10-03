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
public class matrizCuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        int mayor = matriz[0][0];

        int filaMayor = 0;
        int columnaMayor = 0;

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] > mayor) {

                    mayor = matriz[i][j];

                    filaMayor = i;
                    columnaMayor = j;
                }
            }
        }
        System.out.println("\nEl valor mayor es: " + mayor);
        System.out.println("Se encuentra en la fila: " + filaMayor);
        System.out.println("Se encuentra en la columna: " + columnaMayor);
    }    
}
