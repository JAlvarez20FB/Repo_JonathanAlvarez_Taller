
import java.util.Scanner;

/*
 * Problema:Con una matriz f x c(cargada por teclado):

Mostrar la matriz en formato de tabla
Calcular la suma de cada fila y mostrarla
Requisitos:

Formato sugerido:
Fila 1 -> suma = ...
Fila 2 -> suma = ...
 * @author Jonathan Alvarez
 */
public class MatrizRecorrido {
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
        System.out.println("\nMatriz:");
        for (int i = 0; i < f; i++) {
            int sumaFila = 0;

            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
            }
            System.out.println("\nFila " + (i + 1) + " -> suma = " + sumaFila);
        }
    }
}