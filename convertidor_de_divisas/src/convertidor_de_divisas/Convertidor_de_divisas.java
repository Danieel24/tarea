/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidor_de_divisas;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Convertidor_de_divisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la cantidad en pesos mexicanos: ");
    double pesosMexicanos = scanner.nextDouble();

    System.out.println("Seleccione una moneda para convertir:");
    System.out.println("1. Dólar (USD)");
    System.out.println("2. Euro (EUR)");
    System.out.println("3. Bath (THB)");
    System.out.println("4. Yen (JPY)");
    System.out.println("5. Won (KRW)");
    System.out.println("6. Dólar Australiano (AUD)");
    System.out.println("7. Sol (PEN)");
    System.out.println("8. Dólar Canadiense (CAD)");
    System.out.println("9. Bolívar (VES)");
    System.out.println("10. Peso Argentino (ARS)");

    int opcion = scanner.nextInt();

    double cantidadConvertida = 0;

    switch (opcion) {
      case 1:
        cantidadConvertida = pesosMexicanosToUSD(pesosMexicanos);
        System.out.println("La cantidad en dólares es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 2:
        cantidadConvertida = pesosMexicanosToEUR(pesosMexicanos);
        System.out.println("La cantidad en euros es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 3:
        cantidadConvertida = pesosMexicanosToTHB(pesosMexicanos);
        System.out.println("La cantidad en baths es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 4:
        cantidadConvertida = pesosMexicanosToJPY(pesosMexicanos);
        System.out.println("La cantidad en yenes es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 5:
        cantidadConvertida = pesosMexicanosToKRW(pesosMexicanos);
        System.out.println("La cantidad en wons es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 6:
        cantidadConvertida = pesosMexicanosToAUD(pesosMexicanos);
        System.out.println("La cantidad en dólares australianos es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 7:
        cantidadConvertida = pesosMexicanosToPEN(pesosMexicanos);
        System.out.println("La cantidad en soles es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 8:
        cantidadConvertida = pesosMexicanosToCAD(pesosMexicanos);
        System.out.println("La cantidad en dólares canadienses es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 9:
        cantidadConvertida = pesosMexicanosToVES(pesosMexicanos);
        System.out.println("La cantidad en bolívares es: " + String.format("%.2f", cantidadConvertida));
        break;
      case 10:
        cantidadConvertida = pesosMexicanosToARS(pesosMexicanos);
        System.out.println("La cantidad en pesos argentinos es: " + String.format("%.2f", cantidadConvertida));
        break;
      default:
        System.out.println("Error: opción inválida");
    }
  }

  private static double pesosMexicanosToUSD(double pesosMexicanos) {
    return pesosMexicanos * 0.052; // tipo de cambio aproximado
  }

  private static double pesosMexicanosToEUR(double pesosMexicanos) {
    return pesosMexicanos * 0.043; // tipo de cambio aproximado
  }

  private static double pesosMexicanosToTHB(double pesosMexicanos) {
    return pesosMexicanos * 1.63; // tipo de cambio aproximado
  }

  private static double pesosMexicanosToJPY(double pesosMexicanos) {
    return pesosMexicanos * 5.83; // tipo de cambio aproximado
  }

  private static double pesosMexicanosToKRW(double pesosMexicanos) {
    return pesosMexicanos * 63.15; // tipo de cambio aproximado
  }

  private static double pesosMexicanosToAUD(double pesosMexicanos) {
    return pesosMexicanos * 0.073; // tipo de cambio aproximado
  }

  private static double pesosMexicanosToPEN(double pesosMexicanos){
       return pesosMexicanos * 0.21; // tipo de cambio aproximado   
  }
  private static double pesosMexicanosToCAD(double pesosMexicanos){
       return pesosMexicanos * 0.076; // tipo de cambio aproximado   
  }
  private static double pesosMexicanosToVES(double pesosMexicanos){
       return pesosMexicanos * 2.02; // tipo de cambio aproximado   
  }
  private static double pesosMexicanosToARS(double pesosMexicanos){
       return pesosMexicanos * 51.14; // tipo de cambio aproximado   
  }
    }
    

