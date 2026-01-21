
import java.util.Scanner;

/*
 * Problema:Con un arreglo de Nenteros (cargado por teclado), calcular:

Alcalde
Menor
Promedio (doble)
Requisitos:

Validar N (1..50).
Mostrar resultados con 2 decimales en el promedio.
 * @author Jonathan Alvarez
 */
public class ArregloProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese N (1-50): ");
        int N = tcl.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("Valor invalido");
        } else {
            int[] arreglo = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = tcl.nextInt();
            }
            int mayor = arreglo[0];
            int menor = arreglo[0];
            int suma = arreglo[0];
            for (int i = 1; i < N; i++) {
                if (arreglo[i] > mayor) {
                    mayor = arreglo[i];
                }
                if (arreglo[i] < menor) {
                    menor = arreglo[i];
                }
                suma += arreglo[i];
            }
            double promedio = (double) suma / N;
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
            System.out.printf("Promedio: %.2f%n", promedio);
        }
    }
}