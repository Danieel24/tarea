/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese un número: ");
    int num = scanner.nextInt();

    int factorial = calcularFactorial(num);

    System.out.println("El factorial de " + num + " es: " + factorial);
  }

  private static int calcularFactorial(int num) {
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
