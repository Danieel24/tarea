/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencia_de_cuadrados;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Secuencia_de_cuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un número entero positivo: ");
    int numero = scanner.nextInt();

    if (numero <= 0) {
      System.out.println("Error: el número debe ser positivo.");
      return;
    }

    int i = 1;
    do {
      int cuadrado = i * i;
      System.out.print(cuadrado + " ");
      i++;
    } while (i <= numero);

    System.out.println();
  }
}
