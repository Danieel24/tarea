/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteo_letra_a;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Conteo_letra_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese una palabra: ");
    String palabra = scanner.next();

    int contadorA = 0;

    for (int i = 0; i < palabra.length(); i++) {
      char letra = palabra.charAt(i);
      if (letra == 'a' || letra == 'A') {
        contadorA++;
      }
    }

    System.out.println("La letra 'a' aparece " + contadorA + " veces en la palabra.");
  }
}
