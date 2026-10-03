/*
 * Ejercicio 5. Búsqueda de un valor
 */
package Parcialcorteuno;

import java.util.Scanner;

/**
 *
 * @author cordo
 */
public class buscarValor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        
        int[] vector = new int[n]; //creacion vector
        
        for (int i = 0; i < vector.length; i++){ //captura la informacion
            System.out.print("Ingrese el elemento " + i + ": ");
            vector[i] = sc.nextInt();            
        }
        System.out.print("Ingrese el valor que desea buscar: ");
        int buscar = sc.nextInt();
        
        boolean encontrado = false;
        
        int posicion = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar){
                encontrado = true;
                posicion = i;
                break;
            }
        }
        if (encontrado){
            System.out.println("El valor existe.");
            System.out.println("Se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El valor no existe en el vector.");
        }
    }    
}
