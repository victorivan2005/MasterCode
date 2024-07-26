/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Palindromo {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
         public static boolean lomismo(String cadena) {
        int left = 0;
        int right = cadena.length() - 1;
        
        while (left < right) {
            if (cadena.charAt(left) != cadena.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true; 
    }
    public static void main(String[] args) {
        Scanner bobesponja = new Scanner(System.in);
        String palabras;
        System.out.print("Ingrese la palabra magica: ");
        palabras=bobesponja.nextLine();
        if (lomismo(palabras)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }
}