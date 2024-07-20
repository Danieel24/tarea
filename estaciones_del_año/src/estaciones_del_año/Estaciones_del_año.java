/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaciones_del_año;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Estaciones_del_año {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el número de mes (1-12): ");
    int mes = scanner.nextInt();

    if (mes < 1 || mes > 12) {
      System.out.println("Error: el número de mes debe estar entre 1 y 12");
      return;
    }

    String estacion = "";

    switch (mes) {
      case 1:
      case 2:
      case 12:
        estacion = "Invierno";
        break;
      case 3:
      case 4:
      case 5:
        estacion = "Primavera";
        break;
      case 6:
      case 7:
      case 8:
        estacion = "Verano";
        break;
      case 9:
      case 10:
      case 11:
        estacion = "Otoño";
        break;
    }

    System.out.println("La estación del año es: " + estacion);
  }
}
