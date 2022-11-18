
package tarea6pilas;

public class Tarea6Pilas {

    
    public static void main(String[] args) {
        Pilas<String> pila = new Pilas<>();
        
        System.out.println("Elementos que se van a agregrar: ");
        pila.push("Angela");
        pila.push("Diego");
        pila.push("Juan");
        System.out.println(pila);
        
        System.out.println("Se agrega a Diana");
        pila.push("Diana");
        System.out.println(pila);
        
        System.out.println("Esta vacia?");
        System.out.println(pila.isEmpty());
        System.out.println(pila);
        
        System.out.println("Elimina elemento");
        String sacado = pila.pop();
        System.out.println(pila);
        System.out.println("Sacamos: " + sacado);
        
        System.out.println("Cual es el tope?");
        System.out.println(pila.peek());
        
        System.out.println("Numero de elementos");
        System.out.println(pila.getLength());
        
    }
    
}
