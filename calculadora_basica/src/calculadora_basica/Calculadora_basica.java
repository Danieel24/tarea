/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_basica;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Calculadora_basica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    while (true) {
      mostrarMenu();
      int opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          sumar(scanner);
          break;
        case 2:
          restar(scanner);
          break;
        case 3:
          multiplicar(scanner);
          break;
        case 4:
          dividir(scanner);
          break;
        default:
          System.out.println("Opción inválida. Intente nuevamente.");
      }

      System.out.print("¿Desea continuar? (s/n): ");
      String respuesta = scanner.next();

      if (respuesta.equalsIgnoreCase("n")) {
        break;
      }
    }
  }

  public static void mostrarMenu() {
    System.out.println("Calculadora Básica");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.print("Seleccione una opción: ");
  }

  public static void sumar(Scanner scanner) {
    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();
    double resultado = num1 + num2;
    System.out.println("El resultado es: " + resultado);
  }

  public static void restar(Scanner scanner) {
    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();
    double resultado = num1 - num2;
    System.out.println("El resultado es: " + resultado);
  }

  public static void multiplicar(Scanner scanner) {
    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();
    double resultado = num1 * num2;
    System.out.println("El resultado es: " + resultado);
  }

  public static void dividir(Scanner scanner) {
    System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();

    if (num2 == 0) {
      System.out.println("Error: no se puede dividir entre cero.");
    } else {
      double resultado = num1 / num2;
      System.out.println("El resultado es: " + resultado);
    }
  }
}
