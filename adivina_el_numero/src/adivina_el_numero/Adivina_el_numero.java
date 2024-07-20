/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivina_el_numero;

/**
 *
 * @author ABC
 */
import java.util.*;
public class Adivina_el_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
    int numeroSecreto = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100

    Scanner scanner = new Scanner(System.in);

    int intentos = 0;
    while (true) {
      System.out.print("Adivina el número (entre 1 y 100): ");
      int suposicion = scanner.nextInt();
      intentos++;

      if (suposicion == numeroSecreto) {
        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
        break;
      } else if (suposicion < numeroSecreto) {
        System.out.println("Tu suposición es demasiado baja. Intenta de nuevo.");
      } else {
        System.out.println("Tu suposición es demasiado alta. Intenta de nuevo.");
      }
    }
  }
}
