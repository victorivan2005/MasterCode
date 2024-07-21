/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinaelnumero;

/**
 *
 * @author Admin
 */
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int suposicion = 0;
        
        System.out.println("He generado un numero aleatorio entre 1 y 100. ¡Intenta adivinarlo!");
        
        // Loop hasta que el usuario adivine el número
        while (suposicion != numeroAleatorio) {
            System.out.print("Ingresa tu suposicion: ");
            suposicion = scanner.nextInt();
            
            if (suposicion < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("Felicidades! Has adivinado el numero correcto.");
            }
        }
        
        scanner.close();
    }
}

