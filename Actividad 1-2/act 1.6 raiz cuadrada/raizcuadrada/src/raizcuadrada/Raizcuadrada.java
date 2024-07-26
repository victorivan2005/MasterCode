/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raizcuadrada;
/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Raizcuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baby = new Scanner(System.in);
        Double fifa19,square;
        System.out.print("Ingresa un número para sacarle su raiz cuadrada: ");
        fifa19=baby.nextDouble();
        square= Math.sqrt(fifa19);
        System.out.println("La raíz cuadrada del numero " + fifa19 + " es: " + square);
    }
}
