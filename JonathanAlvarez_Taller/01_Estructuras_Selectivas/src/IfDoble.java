
import java.util.Scanner;

/*
 *Problema:  Ingrese una nota final (0–100).
Si la nota es >= 70 , muestree Aprobado; caso contrario, Reprobado.

Requisitos:

Validar rango 0–100. Si no cumple, mostrar Nota inváliday terminar.
Usar if doble (if/else) .
Ejemplo:

85→Aprobado
60→Reprobado
120→Nota inválida
 * @author Jonathan Alvarez
 */
public class IfDoble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese una nota (0-100):");
        int nota = tcl.nextInt();
        if (nota < 0 || nota >100) {
            System.out.println("nota ingresadda invalida");
        }else if (nota >=85) {
            System.out.println("aprobado");
        }else{
            System.out.println("reprobado");
        }
    }
}
