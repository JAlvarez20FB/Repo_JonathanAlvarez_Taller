
import java.util.Scanner;

/*
 * Problema: Defina una contraseña correcta (por ejemplo: "utpl").
Pida al ingresar usuario una contraseña hasta que sea correcta.

Requisitos:

Usar mientras .
Contar intentos y al final mostrar: Acceso concedido en X intento(s).
Ejemplo:

Entradas: abc, 123, utpl→Acceso concedido en 3 intento(s)

 * @author Jonathan Alvarez
 */
public class WhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String contrasenaCorrecta = "utpl";
        String contrasenaIngresada;
        int intentos = 0;
        while (true) {
            System.out.print("Ingrese la contraseña: ");
            contrasenaIngresada = tcl.nextLine();
            intentos++;
            if (contrasenaIngresada.equals(contrasenaCorrecta)) {
                System.out.println("Acceso concedido en " + intentos + " intento(s)");
                break;
            }
        }
    }
}
