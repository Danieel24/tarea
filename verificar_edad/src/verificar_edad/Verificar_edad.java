/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificar_edad;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Verificar_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese su edad: ");
    int edad = scanner.nextInt();

    if (edad >= 18) {
      System.out.println("Usted es elegible para votar.");
    } else {
      System.out.println("Usted no es elegible para votar. Debe tener al menos 18 años.");
    }
  }
}
