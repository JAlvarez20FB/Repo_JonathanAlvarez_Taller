
import java.util.Scanner;

/*
 * Problema:Solicite filas f(1..10) y columnas c(1..10). Cree una matriz f x c
de enteros y llénela por teclado.

Requisitos:

Validar rangos.
Al finalizar, mostrar Matriz cargada.
 * @author Jonathan Alvarez
 */
public class SistemaBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese filas (1-10): ");
        int f = tcl.nextInt();
        System.out.print("Ingrese columnas (1-10): ");
        int c = tcl.nextInt();
        if (f < 1 || f > 10 || c < 1 || c > 10) {
            System.out.println("Valores inválidos. Filas y columnas deben estar entre 1 y 10.");
        } else {
            int[][] matriz = new int[f][c];
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = tcl.nextInt();
                }
            }
            System.out.println("Matriz cargada.");
        }
    }
}