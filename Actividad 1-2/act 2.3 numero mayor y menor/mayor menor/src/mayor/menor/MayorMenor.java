/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayor.menor;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fifa =new Scanner(System.in); 
        int[] deadpool=new int[8];       

        System.out.println("escribe solo 8 numeros: "); 

        for (int i = 0; i < 8; i++) { 
            System.out.print("numerito" + (i + 1) + ": "); 
            deadpool[i] = fifa.nextInt(); 
        } 
         int yo=deadpool[0]; 
        int minovia=deadpool[0]; 
        for (int i = 1; i < deadpool.length; i++) { 
            if (deadpool[i] > yo) { 
                yo=deadpool[i]; 
            } 
            if (deadpool[i]<minovia) { 
                minovia=deadpool[i]; 
            } 
        } 
        System.out.println("El número mayor es: " + yo); 
        System.out.println("El número menor es: " + minovia); 
    } 

}