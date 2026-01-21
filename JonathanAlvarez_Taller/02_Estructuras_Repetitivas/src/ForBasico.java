
import java.util.Scanner;

/*
 * Problema: Solicite un número entero ny muestre su tabla del 1 al 12.

Requisitos:

Usar para .
Validar que nsea positivo.
Salida esperada (formato sugerido): n x i = resultado

 * @author Jonathan Alvarez
 */
public class ForBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo: ");
        int n = tcl.nextInt();

        if (n <= 0) {
            System.out.println("Numero invalido. Debe ser positivo.");
        } else {
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}