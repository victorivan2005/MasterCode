/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradecalificacionesfinales;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Calculadoradecalificacionesfinales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        float parcial,proyecto,examen,calparcial,calproyecto,calexamen,notatotal;

        System.out.println("Ingrese su calificacion del parcial");
        parcial =teclado.nextFloat();
        System.out.println("Ingrese su calificacion del proyecto");
        proyecto =teclado.nextFloat();
        System.out.println("Ingrese su calificacion del examen final");
        examen =teclado.nextFloat();
        calparcial=(parcial*4)/4;
        calproyecto=(proyecto*3)/3;
        calexamen=(examen*3)/3;
        notatotal=(calparcial+calproyecto+calexamen)/3;
        System.out.println("su nota total es: " + notatotal);
    }
}