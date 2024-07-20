/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencia_aritmetica;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Secuencia_aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el primer número de la secuencia: ");
    int primerNumero = scanner.nextInt();

    System.out.print("Ingrese la diferencia entre los números: ");
    int diferencia = scanner.nextInt();

    System.out.print("Ingrese el número máximo hasta el cual la secuencia debe continuar: ");
    int numeroMaximo = scanner.nextInt();

    int i = primerNumero;
    do {
      System.out.print(i + " ");
      i += diferencia;
    } while (i <= numeroMaximo);

    System.out.println();
  }
}
