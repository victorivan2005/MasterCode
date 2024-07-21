/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionesconletras;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Calificacionesconletras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        float parcial;

        System.out.println("Ingrese su calificacion del parcial");
        parcial=teclado.nextFloat();
        if (parcial>=90) {
            System.out.println("A");
        } else if (parcial>=80) {
            System.out.println("B");
        } else if (parcial>=70) {
            System.out.println("C");
        } else if (parcial>=60) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}