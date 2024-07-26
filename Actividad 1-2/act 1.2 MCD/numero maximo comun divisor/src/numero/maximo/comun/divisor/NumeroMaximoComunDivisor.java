/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.maximo.comun.divisor;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class NumeroMaximoComunDivisor {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        public static int messi(int nazario, int yo){
        int ronaldo;
            while (yo != 0) {
                ronaldo = yo;
                yo = nazario % yo;
                nazario = ronaldo;
            }
            return nazario;
        }
        public static void main(String[] args) {
            int pele1,pele2,xavi;
            Scanner cars= new Scanner(System.in);
            System.out.println("Ingrese el primer número ");
            pele1=cars.nextInt();
            
            System.out.println("Ingrese el segundo número: ");
            pele2=cars.nextInt();
            xavi=messi(pele1, pele2);

            System.out.println("El maximo comun divisior de los numeros "+ pele1 +" y "+ pele2 +" es: " + xavi);
        }
    }