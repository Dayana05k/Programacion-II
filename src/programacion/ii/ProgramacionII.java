/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.ii;

import java.util.Scanner;

/**
 *
 * @author cordo
 */
public class ProgramacionII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ejecicios Bucle y while clase");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adivina mi color fav");
        String favcolor = sc.nextLine();
        
        while(!favcolor.equals("amarillo")){
            
            System.out.println("Ese no es, vuelve a intentar");
            System.out.println("Adivina mi color favorito");
            favcolor = sc.nextLine();
        }
        System.out.println("Muy bien");
        
    }
    
}
