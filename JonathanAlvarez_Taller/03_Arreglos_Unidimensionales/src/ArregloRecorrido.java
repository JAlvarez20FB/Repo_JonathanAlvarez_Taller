
import java.util.Scanner;

/*
 * Problema: Con un arreglo de Nenteros (cargado por teclado):

Mostrar todos los valores
Contar cuantos son pares y cuantos impares
Requisitos:

Mostrar al final: Pares: X, Impares: Y.
 * @author Jonathan Alvarez
 */
public class ArregloRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese N (1..50): ");
        int N = tcl.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("Valor invalido. N debe estar entre 1 y 50.");
        } else {
            int[] numeros = new int[N];
            int pares = 0;
            int impares = 0;
            for (int i = 0; i < N; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                numeros[i] = tcl.nextInt();
            }
            System.out.println("Valores ingresados:");
            for (int i = 0; i < N; i++) {
                System.out.println(numeros[i]);
                if (numeros[i] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Pares: " + pares + ", Impares: " + impares);
        }
    }
}
