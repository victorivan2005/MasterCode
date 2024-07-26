/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertir.elementos;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class InvertirElementos {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        public static void main(String[] args) {
            Scanner byctor2049 = new Scanner(System.in);
            int[] n = new int[6];
            System.out.println("Ingresa un maximo de 6 numero: ");
            for (int j = 0; j < 6; j++) {
                n[j] = byctor2049.nextInt();
            }
            invertirArray(n);
            System.out.println("tus numeros invertidos son: ");
            for (int t = 0; t < 6; t++) {
                System.out.print(n[t] + " ");
            }
        }
        public static void invertirArray(int[] array) {
            int inicio,fin;
             inicio = 0;
             fin = array.length - 1;
            
            while (inicio < fin) {
                int temp = array[inicio];
                array[inicio] = array[fin];
                array[fin] = temp;
                inicio++;
                fin--;
            }
        }
    }