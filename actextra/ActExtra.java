
package actextra;

import java.io.IOException;
import java.util.Scanner;


public class ActExtra {
    public static void main(String[] args) throws IOException {
        int texto;
        String nombre;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Textos a leer");
        System.out.println("Ingresa a la opcion 1 para comprobar el balanceo del texto1.txt");
        System.out.println("Ingresa a la opcion 2 para comprobar el balanceo del texto2.txt");
        
        System.out.println("Opcion elegida: ");
        texto = teclado.nextInt();
        
        switch (texto) {
            case 1 -> {
                System.out.println("El texto a leer es:");
                nombre = "texto1.txt";
                BalanceoParentesis bal1 = new BalanceoParentesis(nombre);
                System.out.println(bal1.balanceo());
            }
            case 2 -> {
                System.out.println("El texto a leer es:");
                nombre = "texto2.txt";
                BalanceoParentesis bal1 = new BalanceoParentesis(nombre);
                System.out.println(bal1.balanceo());
            }

            default ->
                throw new AssertionError();
        }

    }
}

