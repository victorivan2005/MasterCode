/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma.de.elementos;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class SumaDeElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner programacion= new Scanner(System.in);
        int[] frutamelon= new int[5];
        int sum = 0;

        System.out.println("Ingrese 5 números: ");
        for (int n = 0; n < 5; n++) {
            System.out.print("Número " + (n + 1) + ": ");
            frutamelon[n] = programacion.nextInt();
        }
        for (int numero : frutamelon) {
            sum+= numero;
        }
        System.out.println("La suma de todos los elementos es: " + sum);
    }
}