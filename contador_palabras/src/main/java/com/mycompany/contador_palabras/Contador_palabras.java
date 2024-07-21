/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contador_palabras;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Contador_palabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contador++;
            }
        }
        System.out.println("La letra 'A' aparece " + contador + " veces en la palabra \"" + palabra + "\".");

        scanner.close();
    }
}

