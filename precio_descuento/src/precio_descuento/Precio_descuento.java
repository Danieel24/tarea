/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precio_descuento;

/**
 *
 * @author ABC
 */
import java.util.Scanner;
public class Precio_descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el precio original del producto: ");
    double precioOriginal = scanner.nextDouble();

    double descuento = 0;

    if (precioOriginal <= 100) {
      descuento = 0;
    } else if (precioOriginal > 100 && precioOriginal <= 200) {
      descuento = 0.10;
    } else if (precioOriginal > 200 && precioOriginal <= 500) {
      descuento = 0.20;
    } else if (precioOriginal > 500) {
      descuento = 0.25;
    }

    double precioFinal = precioOriginal - (precioOriginal * descuento);

    System.out.println("El precio final del producto es: $" + String.format("%.2f", precioFinal));
  }
}
