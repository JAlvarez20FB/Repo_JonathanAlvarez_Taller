
import java.util.Scanner;

/*
 *Problema: Ingrese un puntaje (0–100) y clasifique:

90–100: Excelente
70–89: Bueno
0–69: En proceso
Requisitos:

Validar rango 0–100.
Usar if anidado (mínimo 2 niveles).
No usar switch.
Ejemplo:

95 → Excelente
75 → Bueno
40 → En proceso
 * @author Jonathan Alvarez
 */
public class IfAnidado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("ingrese un puntaje (0-100):");
        int puntaje = tcl.nextInt();
        if (puntaje < 0 || puntaje > 100) {
            System.out.println("Puntaje invalido");
        } else {
            if (puntaje >= 90) {
                System.out.println("Excelente");
            } else {
                if (puntaje >= 70) {
                    System.out.println("Bueno");
                } else {
                    System.out.println("En proceso");
                }
            }
        }
    }
}
