/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a.por.o;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class APorO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner hansiflick= new Scanner(System.in);
            String paeya;
            System.out.println("Ingresa una la palabra que tu quieras: ");
            paeya=hansiflick.nextLine();
            System.out.println("Replazar: " + paeya.replace('a' , 'o'));
        }
    }