/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.primo.o.no;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class NumeroPrimoONo {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        public static boolean vitorI(int rockstar) {
            if (rockstar <= 1) {
                return false;
            }
            for (int v = 2; v <= Math.sqrt(rockstar); v++) {
                if (rockstar % v == 0) {
                    return false;
                }
            }
            return true;
        }
            public static void main(String[] args) {
            Scanner byctor2049 = new Scanner(System.in);
            int pocoyo;
            System.out.print("Ingresa un número: ");
            pocoyo = byctor2049.nextInt();
            if (vitorI(pocoyo)) {
                System.out.println("El valor " + pocoyo + " es primo.");
            } else {
                System.out.println("El valor " + pocoyo + " no es primo.");
            }
        }
    }