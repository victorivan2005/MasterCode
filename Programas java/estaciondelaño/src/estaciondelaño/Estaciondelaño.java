/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaciondelaño;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Estaciondelaño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        int mes;
        System.out.println("ingresa un numero del mes del 1 al 12");
        mes=teclado.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Es invierno");
                break;
            case 2:
                System.out.println("Es invierno");
            break;
            case 3:
            System.out.println("Es primavera");
            break;
            case 4:
            System.out.println("Es primavera");
            break;
            case 5:
            System.out.println("Es primavera");
            break;
            case 6:
            System.out.println("Es verano");
            break;
            case 7:
            System.out.println("Es verano");
            break;
            case 8:
            System.out.println("Es verano");
            break;
            case 9:
            System.out.println("Es otoño");
            break;
            case 10:
            System.out.println("Es otoño");
            break;
            case 11:
            System.out.println("Es otoño");
            break;
            case 12:
            System.out.println("Es invierno");
            break;
            default:
            System.out.println("Esa opcion no existe");
                break;
        }
    }
}