
import java.util.Scanner;

/*
 * Problema: Solicite N(1..50). Cree un arreglo de Nenteros 
y cargue valores por teclado.

Requisitos:

Validar N en rango.
Al finalizar, mostrar Carga completada.
 * @author Jonathan Alvarez
 */
public class ArregloCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese N (1-50): ");
        int N = tcl.nextInt();
        if (N < 1 || N > 50) {
            System.out.println("Valor invalido. N debe estar entre 1 y 50.");
        } else {
            int[] arreglo = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("Ingrese el valor " + (i + 1) + ": ");
                arreglo[i] = tcl.nextInt();
            }
            System.out.println("Carga completada.");
        }
    }
}