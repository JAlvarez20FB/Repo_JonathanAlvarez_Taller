
import java.util.Scanner;

/*
* Ejercicio: Solicita 2 números y calcula:

suma
resto
producto
mayor (retornar el mayor)
Requisitos:

Implementar métodos con retorno:
sumar(double a, double b)
restar(double a, double b)
multiplicar(double a, double b)
mayor(double a, double b)
 * @author Jonathan Alvarez
 */
public class MetodosConRetorno {
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double mayor(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double n1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double n2 = tcl.nextDouble();
        System.out.println("Suma: " + sumar(n1, n2));
        System.out.println("Resta: " + restar(n1, n2));
        System.out.println("Producto: " + multiplicar(n1, n2));
        System.out.println("Mayor: " + mayor(n1, n2));
    }
}
