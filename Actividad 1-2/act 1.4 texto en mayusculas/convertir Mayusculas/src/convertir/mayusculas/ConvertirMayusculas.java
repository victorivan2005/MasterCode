/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertir.mayusculas;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class ConvertirMayusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner estoymuriendo = new Scanner(System.in); 
String palabramagica; 
System.out.println("Ingrese una palabra o cadena de texto:");
System.out.println("Para salir clicke(enter) ");
do {
    palabramagica=estoymuriendo.nextLine(); 
  if (!palabramagica.isEmpty()){
   String textoMayusculas = palabramagica.toUpperCase(); 
   System.out.print(textoMayusculas); 
  }
} while (!palabramagica.isEmpty());
  System.out.print("El Programa ha finalizado"); 
    }
}
