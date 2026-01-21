
import java.util.Scanner;

/*
 * Problema: Ingrese un entero N(>=1). Calcula la suma 1+2+...+N usando:

mientras
hacer mientras
para
Muestre los tres resultados y verifique que coincidan.

Requisitos:

Validación de N (>=1).
Mostrar:
Suma con while: ...
Suma con do-while: ...
Suma con for: ...
Si no coincide (no debería ocurrir), mostrar Revisar implementación.

 * @author Jonathan Alvarez
 */
public class ComparacionCiclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un entero N (>= 1): ");
        int N = tcl.nextInt();
        if (N < 1) {
            System.out.println("Valor invalido. N debe ser mayor o igual a 1.");
        } else {
            //suma con while
            int sumaWhile = 0;
            int i = 1;
            while (i <= N) {
                sumaWhile += i;
                i++;
            }
            // suma con do-while
            int sumaDoWhile = 0;
            int j = 1;
            do {
                sumaDoWhile += j;
                j++;
            } while (j <= N);
            // suma con for
            int sumaFor = 0;
            for (int k = 1; k <= N; k++) {
                sumaFor += k;
            }
            System.out.println("Suma con while: " + sumaWhile);
            System.out.println("Suma con do-while: " + sumaDoWhile);
            System.out.println("Suma con for: " + sumaFor);

            // Verificacion
            if (sumaWhile == sumaDoWhile && sumaWhile == sumaFor) {
                System.out.println("Los resultados coinciden.");
            } else {
                System.out.println("Revisar implementacion.");
            }
        }
    }
}