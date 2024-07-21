package com.mycompany.contapalabras;



/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Contapalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Convertir el número a una cadena para contar los dígitos
        String numeroStr = Integer.toString(numero);
        
        // Contar los dígitos, excluyendo el signo negativo si está presente
        int numDigitos = numeroStr.length();
        if (numero < 0) {
            numDigitos--; // Restar uno si el número es negativo
        }
        
        System.out.println("El número tiene " + numDigitos + " dígitos.");
        
        scanner.close();
    }
}
