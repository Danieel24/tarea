/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacion_con_letras;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Calificacion_con_letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la calificación numérica (0-100): ");
    double calificacion = scanner.nextDouble();

    if (calificacion < 0 || calificacion > 100) {
      System.out.println("Error: la calificación debe estar entre 0 y 100");
      return;
    }

    char letra = 'F';

    if (calificacion >= 90) {
      letra = 'A';
    } else if (calificacion >= 80) {
      letra = 'B';
    } else if (calificacion >= 70) {
      letra = 'C';
    } else if (calificacion >= 60) {
      letra = 'D';
    }

    System.out.println("La calificación es: " + letra);
  }
}
