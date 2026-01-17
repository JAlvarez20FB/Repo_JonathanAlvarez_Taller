
import java.util.Scanner;

/*
 *Problema: Solicite al usuario su edad (entero).
Si la edad es mayor o igual a 18 , muestre: Acceso permitido.
Si no, no muestre nada adicional.

Requisitos:

Validar que la edad sea >= 0 . Si no lo es, muéstralo Edad inválida.
Usar if simple (sin else para el caso “menor a 18”).
Ejemplo (entrada → salida):

18→Acceso permitido
-2→Edad inválida
 * @author ASUS TUF
 */
public class IfSimple {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("ingrese la edad: ");
        edad = tcl.nextInt();
        if (edad <= 0) {
            System.out.println("edad invalida");
        }
        if (edad > 18) {
            System.out.println("acceso permitido");
        }
    }
}
