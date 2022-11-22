
package mainadtcolas;


import java.util.Scanner;
public class MainADTColas {    
    public static void main(String[] args) {
        ADTColas<String> cola = new ADTColas<>();
        System.out.println("\nMetodo isEmpty");
        System.out.println("La cola esta Vacia?");
        System.out.println(cola.isEmpty());
        System.out.println("\nNumero de elementos en la cola: " + cola.getLength());
        
        
        System.out.println("\nMetodo enqueue");
        System.out.println("Agrega los elementos a la cola");
        Scanner sc = new Scanner(System.in);
        
        int elementoA;
        int elementoB;
        int elementoC;
        int elementoD;
        
        
        System.out.println("Primer valor: ");
        elementoA = sc.nextInt();
        cola.enqueue("" + elementoA );
        System.out.println("Segundo valor: ");
        elementoB = sc.nextInt();
        cola.enqueue("" + elementoB);
        System.out.println("Tercer valor: ");
        elementoC = sc.nextInt();
        cola.enqueue("" + elementoC);
        System.out.println("Cuarto valor: ");
        elementoD = sc.nextInt();
        cola.enqueue("" + elementoD);
        
        System.out.println("\nMetodo Length");
        System.out.println("Estado actual de la cola: " + cola);
        System.out.println("Tamanio: " + cola.getLength());
        
        System.out.println("\nMetodo isEmpty");
        System.out.println("La cola esta vacia?");
        System.out.println(cola.isEmpty());

        System.out.println("\nMetodo dequeue");
        String sacado = cola.dequeue();
        System.out.println(cola);
        System.out.println("Sacado: " + sacado);
        
        System.out.println("\nMetodo Length");
        System.out.println("Estado actual de la cola: " + cola);
        System.out.println("TAMANIO: " + cola.getLength());

    }
}