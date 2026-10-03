/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ii;

import java.util.Scanner;

/**
 *
 * @author Dayana Cordoba
 */
public class menuParcial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        int[] vector = null;
        
        while (opcion != 4){
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ingresar un vector");
            System.out.println("2. Mostrar suma y promedio");
            System.out.println("3. Mostrar valor mayor y valor menor");
            System.out.println("4. Salir");
            System.out.print("Digite una opcion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Digite la cantidad de numeros: ");
                    int num = sc.nextInt();
                    vector = new int[num];
                    for (int i = 0; i < vector.length; i++){
                        System.out.print("Digite el numero " + (i + 1) + ": ");
                        vector[i] = sc.nextInt();
                    }
                    System.out.println("Vector ingresado correctamente.");
                    break;
                    
                    case 2:
                        if (vector == null){
                            System.out.println("Advertencia: primero debe ingresar el vector.");
                        }else {
                            int suma = 0;
                            for (int i = 0; i < vector.length; i++){
                                suma = suma + vector[i];
                            }
                            double promedio = (double) suma / vector.length;
                            
                            System.out.println("La suma es: " + suma);
                            System.out.println("El promedio es: " + promedio);
                        }
                        break;
                        case 3:
                            if (vector == null) {
                                System.out.println("Advertencia: primero debe ingresar el vector.");
                            }else {
                                int mayor = vector[0];
                                int menor = vector[0];
                                for (int i = 1; i < vector.length; i++) {
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
                            break;
                            case 4:
                                System.out.println("Programa finalizado.");
                                break;
                                default:
                                    System.out.println("Opcion no valida.");
                                    break;                    
            }
        }
        sc.close();
    }
    
}
