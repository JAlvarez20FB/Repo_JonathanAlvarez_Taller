
import java.util.Scanner;

/*
 *Problema: Construya un menú:

Sumar
Restar
Multiplicar
Dividir
Solicite al usuario una opción (1–4) y dos números (double). Ejecute la operación y muestre el resultado.

Requisitos:

Usar switch-case.
En división, si el segundo número es 0, mostrar No se puede dividir para cero.
Si opción inválida, mostrar Opción inválida.
Ejemplo:

Opción 1, números 5 y 3 → Resultado: 8
 * @author Jonathan Alvarez
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.println("MENU DE OPERACIONES");
        System.out.println("1 = Sumar");
        System.out.println("2 = Restar");
        System.out.println("3 = Multiplicar");
        System.out.println("4 = Dividir");
        System.out.print("Ingrese una opcion (1 – 4): ");
        int opcion = tcl.nextInt();

        System.out.print("Ingrese el primer numero: ");
        double num1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num2 = tcl.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir para cero");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Opcion de operacion invalida");
        }
    }
}