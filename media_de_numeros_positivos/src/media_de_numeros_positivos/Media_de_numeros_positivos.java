/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media_de_numeros_positivos;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Media_de_numeros_positivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int contador = 0;
    double suma = 0.0;

    while (true) {
      System.out.print("Ingrese un número positivo (o negativo para salir): ");
      int numero = scanner.nextInt();

      if (numero < 0) {
        break;
      }

      contador++;
      suma += numero;
    }

    if (contador == 0) {
      System.out.println("No se ingresaron números positivos.");
    } else {
      double media = suma / contador;
      System.out.println("La media de los números positivos es: " + media);
    }
  }
}
