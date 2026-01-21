
import java.util.Scanner;

/*
 * Problema:Implementar un menú con opciones que llamen a métodos void :

Mostrar saludo
Mostrar tabla de un número (1..12)
Salir
Requisitos:

Crear métodos:
mostrarSaludo()
mostrarTabla(int n)
maincontrola el menú y llama a métodos.
 * @author Jonathan Alvarez
 */
public class MetodosSinRetorno {
    public static void mostrarSaludo() {
        System.out.println("Hola, bienvenido al programa.");
    }
    public static void mostrarTabla(int n) {
        if (n <= 0) {
            System.out.println("Numero invalido.");
            return;
        }
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Mostrar saludo");
            System.out.println("2. Mostrar tabla de un numero");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = tcl.nextInt();
            switch (opcion) {
                case 1:
                    mostrarSaludo();
                    break;
                case 2:
                    System.out.print("Ingrese un numero: ");
                    int n = tcl.nextInt();
                    mostrarTabla(n);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }
}