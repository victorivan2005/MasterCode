/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificar.edad.para.votar;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class VerificarEdadParaVotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad=teclado.nextInt();
       if (edad>=18) {
        System.out.println("Puedes votar");
       } else {
        System.out.println("No puedes votar");
       }
    }
}