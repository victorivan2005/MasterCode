/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciocondescuento;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
import java.math.*;
public class Preciocondescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        Double precio,total,pcd;
        
        System.out.println("ingrese el precio del ariticulo");
        precio=teclado.nextDouble();
        
        if (precio<=100) {
            System.out.println("Sin descuento");
        } else if (precio>100 && precio<=200) {
            total=precio*.10;
            pcd=precio-total;
            System.out.println("El precio con descuento es:" + pcd);
        } else if (precio>200 && precio<=500) {
            total=precio*.20;
            pcd=precio-total;
            System.out.println("El precio con descuento es:" + pcd);
        } else {
            total=precio*.25;
            pcd=precio-total;
            System.out.println("El precion con descuento es:" + pcd);
        }
    }    
}