/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocales_o_no_vocales;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Vocales_o_no_vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Ingrese una letra (o salida para salir): ");
      String entrada = scanner.next();

      if (entrada.equals("salida")) {
        break;
      }

      char letra = entrada.charAt(0);

      if (esVocal(letra)) {
        System.out.println("La letra '" + letra + "' es una vocal.");
      } else {
        System.out.println("La letra '" + letra + "' es una consonante.");
      }
    }
  }

  public static boolean esVocal(char letra) {
    letra = Character.toLowerCase(letra); // Convertir a minúscula para simplificar la comparación
    return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
  }
}
