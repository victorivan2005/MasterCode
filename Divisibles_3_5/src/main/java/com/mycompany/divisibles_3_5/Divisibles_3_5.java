/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisibles_3_5;

/**
 *
 * @author Admin
 */
public class Divisibles_3_5 {
        public static void main(String[] args) {
            int suma = 0;
    
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    suma += i;
                }
            }
    
            System.out.println("La suma de todos los números impares del 1 al 100 es: " + suma);
        }
    }
    
