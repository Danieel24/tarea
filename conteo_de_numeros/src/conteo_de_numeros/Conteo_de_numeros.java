/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteo_de_numeros;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Conteo_de_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de números que desea ingresar: ");
    int cantidadNumeros = scanner.nextInt();

    int positivos = 0;
    int negativos = 0;
    int ceros = 0;

    for (int i = 0; i < cantidadNumeros; i++) {
      System.out.print("Ingrese el número " + (i + 1) + ": ");
      int numero = scanner.nextInt();

      if (numero > 0) {
        positivos++;
      } else if (numero < 0) {
        negativos++;
      } else {
        ceros++;
      }
    }

    System.out.println("Resultados:");
    System.out.println("Numeros mayores que 0: " + positivos);
    System.out.println("Numeros menores que 0: " + negativos);
    System.out.println("Numeros iguales a 0: " + ceros);
  }
}
