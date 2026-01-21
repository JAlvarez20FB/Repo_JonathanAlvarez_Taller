
import java.util.Scanner;

/*
 * Problema:Con una matriz f x c:

Calcular suma total de elementos
Si la matriz es cuadrada (f==c), calcule la suma de la diagonal principal
Requisitos:

Si no es cuadrada, mostrar Diagonal no aplica.
 * @author Jonathan Alvarez
 */
public class MatrizProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el numero de filas: ");
        int f = tcl.nextInt();
        System.out.print("Ingrese el numero de columnas: ");
        int c = tcl.nextInt();
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = tcl.nextInt();
            }
        }
        int sumaTotal = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("Suma total de elementos: " + sumaTotal);
        if (f == c) {
            int sumaDiagonal = 0;
            for (int i = 0; i < f; i++) {
                sumaDiagonal += matriz[i][i];
            }
            System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
        } else {
            System.out.println("Diagonal no aplica");
        }
    }
}