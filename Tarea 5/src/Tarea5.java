
import java.util.Scanner;


public class Tarea5 {


    public static void main(String[] args) {
        
        
       
        ListaLigadaADT head = new ListaLigadaADT();
        System.out.println("Regresa true si esta vacia y false si no esta vacia"); 
        System.out.println(head.estaVacia());
        System.out.println(head.getTamanio());
        System.out.println(head.transversal());
        System.out.println("-------------------------");
        
        int elementos; 
        int elementoA = 0;
        int elementoB = 0;
        int elementoC = 0;
        int elementoD = 0;
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Para tres elementos: ");
        
        System.out.println("Escribe el primer elemento: ");
        elementoA = sc.nextInt();
        System.out.println("Escribe el segundo elemento: ");
        elementoB = sc.nextInt();
        System.out.println("Escribe el tercer elemento: ");
        elementoC = sc.nextInt();
        
        
        head.agregarAlFinal(elementoA);
        head.agregarAInicio(elementoB);
        head.agregarAlFinal(elementoC);
        head.despuesDe(1, elementoD);
        
        System.out.println("La primera lista");
        System.out.println(head.transversal());
        System.out.println(head.estaVacia());
        System.out.println(head.getTamanio());
        System.out.println("La posicion 0 es para el elemento: ");
        int x = sc.nextInt();
        System.out.println("La posicion 1 es para el elemento: ");
        int y = sc.nextInt();
        System.out.println("La posicion 2 es para el elemento: ");
        int z = sc.nextInt();
        System.out.println(head.buscar(x));
        System.out.println(head.buscar(y));
        System.out.println(head.buscar(z));
        System.out.println("--------------------------");
        
        System.out.println("Actualiza con un nuevo numero: ");  
        int elementoE = sc.nextInt();
        head.actualizar(elementoA,elementoE);
        System.out.println(head.transversal());
        System.out.println(head.buscar(elementoE));
        System.out.println("--------------------------");
        
        System.out.println("Que posicion voy a eliminar?");
        int eliminaP = sc.nextInt();

        head.eliminar(eliminaP);
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());

        head.eliminarElPrimero();
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());

        head.eliminarElFinal();
        System.out.println(head.transversal());
        System.out.println(head.getTamanio());
        
        

    }
}

        
   
