/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidor_de_grados;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Convertidor_de_grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la temperatura en grados Celsius: ");
    double celsius = scanner.nextDouble();

    System.out.println("Seleccione una opción para convertir:");
    System.out.println("1. Convertir a Fahrenheit");
    System.out.println("2. Convertir a Kelvin");

    int opcion = scanner.nextInt();

    double temperaturaConvertida = 0;

    switch (opcion) {
      case 1:
        temperaturaConvertida = celsiusToFahrenheit(celsius);
        System.out.println("La temperatura en Fahrenheit es: " + String.format("%.2f", temperaturaConvertida));
        break;
      case 2:
        temperaturaConvertida = celsiusToKelvin(celsius);
        System.out.println("La temperatura en Kelvin es: " + String.format("%.2f", temperaturaConvertida));
        break;
      default:
        System.out.println("Error: opción inválida");
    }
  }

  private static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
  }

  private static double celsiusToKelvin(double celsius) {
    return celsius + 273.15;
  }
}
