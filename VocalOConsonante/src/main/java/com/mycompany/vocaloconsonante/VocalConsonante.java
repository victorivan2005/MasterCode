/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vocaloconsonante;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class VocalConsonante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingresa una letra (o espacio para salir): ");
            String input = scanner.nextLine();

            // Verificar si el input es un espacio para terminar el programa
            if (input.equals(" ")) {
                System.out.println("Programa terminado.");
                break;
            }

            // Verificar si la entrada tiene más de un caracter
            if (input.length() != 1) {
                System.out.println("Entrada inválida. Ingresa solo una letra.");
                continue;  // Volver al inicio del bucle
            }

            char letra = input.charAt(0);

            // Verificar si es una vocal
            if (esVocal(letra)) {
                System.out.println(letra + " es una vocal.");
            } else {
                System.out.println(letra + " es una consonante.");
            }
        }

        scanner.close();
    }

    // Método para verificar si un caracter es vocal
    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);  // Convertir a minúscula para verificar

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            return true;
        }

        return false;
    }
}