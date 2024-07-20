/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradecalificaciones;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class CalculadoraDeCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la nota de parciales (0-100): ");
    double parciales = scanner.nextDouble();

    System.out.print("Ingrese la nota del proyecto (0-100): ");
    double proyecto = scanner.nextDouble();

    System.out.print("Ingrese la nota del examen final (0-100): ");
    double examenFinal = scanner.nextDouble();

    if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100 || examenFinal < 0 || examenFinal > 100) {
      System.out.println("Error: las notas deben estar entre 0 y 100");
      return;
    }

    double notaFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);

    System.out.println("La nota final es: " + notaFinal);
  }
}
