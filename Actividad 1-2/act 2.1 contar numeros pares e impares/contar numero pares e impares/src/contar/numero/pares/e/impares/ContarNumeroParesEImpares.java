/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contar.numero.pares.e.impares;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class ContarNumeroParesEImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lluvia= new Scanner(System.in);
        int[] penelope= new int[10];
        int contadorP=0;
        int contadorI=0;

        System.out.println("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            penelope[i] = lluvia.nextInt();
        }
        for (int numero : penelope) {
            if (numero % 2 == 0) {
                contadorP++;
            } else {
                contadorI++;
            }
        }
        System.out.println("Cantidad de números pares: " + contadorP);
        System.out.println("Cantidad de números impares: " + contadorI);
    }
}