

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class java {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random ();
        int n;
        System.out.println("ingrese el tamaño: ");
        n = tcl.nextInt();
        int arreglo [] = new int [n];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("ingrese el valor "+ (i+1)+": ");
            arreglo [i] = tcl.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i]+"  ");
        }
    }
}
