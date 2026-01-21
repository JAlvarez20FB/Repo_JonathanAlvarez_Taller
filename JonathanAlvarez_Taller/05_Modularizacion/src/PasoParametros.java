
import java.util.Scanner;

/*
 * Problema:Desarrollar un sistema en consola que permita:

Registrador N estudiantes (1..30): nombre y nota (0..100)
Mostrar listado (nombre – nota)
Calcular y mostrar:
Promedio del curso
Mayor nota y estudiante
Menor nota y estudiante
Permitir buscar por nombre (coincidencia exacta) y mostrar su nota
Requisitos:

Usar:
arreglos (nombre[], nota[])
ciclos (para/mientras)
métodos (modularización obligatoria)
Menú principal repetitivo hasta opción0. Salir
Validaciones básicas (N, notas, opción de menú)
Buenas prácticas: nombres claros, comentarios breves.
Sugerencia de métodos (mínimos):

leerEnteroEnRango(...)
leerNotaValida(...)
registrarEstudiantes(...)
mostrarListado(...)
calcularPromedio(...)
buscarPorNombre(...)
 * @author Jonathan Alvarez
 */
public class PasoParametros {
    static Scanner tcl = new Scanner(System.in);
    public static int leerEnteroEnRango(String mensaje, int min, int max) {
        int valor;
        do {
            System.out.print(mensaje);
            valor = tcl.nextInt();
            if (valor < min || valor > max) {
                System.out.println("Valor invalido. Debe estar entre " + min + " y " + max + ".");
            }
        } while (valor < min || valor > max);
        return valor;
    }
    public static double leerNotaValida() {
        double nota;
        do {
            System.out.print("Ingrese nota (0..100): ");
            nota = tcl.nextDouble();
            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida.");
            }
        } while (nota < 0 || nota > 100);
        return nota;
    }
    public static void registrarEstudiantes(String[] nombres, double[] notas, int n) {
        tcl.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
            notas[i] = leerNotaValida();
        }
    }
    public static void mostrarListado(String[] nombres, double[] notas, int n) {
        System.out.println("\nLISTADO DE ESTUDIANTES");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - " + notas[i]);
        }
    }
    public static double calcularPromedio(double[] notas, int n) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
        }
        return suma / n;
    }
    public static void mostrarMayorMenor(String[] nombres, double[] notas, int n) {
        int posMayor = 0;
        int posMenor = 0;
        for (int i = 1; i < n; i++) {
            if (notas[i] > notas[posMayor]) {
                posMayor = i;
            }
            if (notas[i] < notas[posMenor]) {
                posMenor = i;
            }
        }
        System.out.println("Mayor nota: " + notas[posMayor] + " - " + nombres[posMayor]);
        System.out.println("Menor nota: " + notas[posMenor] + " - " + nombres[posMenor]);
    }
    public static void buscarPorNombre(String[] nombres, double[] notas, int n) {
        tcl.nextLine(); // limpiar buffer
        System.out.print("Ingrese nombre a buscar: ");
        String buscado = tcl.nextLine();
        for (int i = 0; i < n; i++) {
            if (nombres[i].equals(buscado)) {
                System.out.println("Nota de " + nombres[i] + ": " + notas[i]);
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }
    public static void main(String[] args) {
        int N = leerEnteroEnRango("Ingrese numero de estudiantes (1..30): ", 1, 30);
        String[] nombres = new String[N];
        double[] notas = new double[N];
        registrarEstudiantes(nombres, notas, N);
        int opcion;
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Mostrar listado");
            System.out.println("2. Mostrar promedio del curso");
            System.out.println("3. Mostrar mayor y menor nota");
            System.out.println("4. Buscar estudiante por nombre");
            System.out.println("0. Salir");
            opcion = leerEnteroEnRango("Seleccione una opcion: ", 0, 4);
            switch (opcion) {
                case 1:
                    mostrarListado(nombres, notas, N);
                    break;
                case 2:
                    System.out.printf("Promedio del curso: %.2f%n", calcularPromedio(notas, N));
                    break;
                case 3:
                    mostrarMayorMenor(nombres, notas, N);
                    break;
                case 4:
                    buscarPorNombre(nombres, notas, N);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        } while (opcion != 0);
    }
}