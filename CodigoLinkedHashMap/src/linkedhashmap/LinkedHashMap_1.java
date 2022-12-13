
package linkedhashmap;
import java.util.LinkedHashMap;

public class LinkedHashMap_1 {

    
    public static void main(String[] args) {
        LinkedHashMap dicc = new LinkedHashMap();

 //Hay que aniadir los valores con sus llaves
 dicc.put(3, "Uno");
 dicc.put(7, "Dos");
 dicc.put(8, "Tres");
 dicc.put(0, "Cuatro");
 dicc.put(1, "Cinco");
 dicc.put(5, "Seis");

 //Este metodo imprime todos los elementos
 System.out.println(dicc.entrySet());

 //Este metodo imprime el valor solicitando por la llave
 System.out.println(dicc.get(3));
 System.out.println(dicc.get(0));
 System.out.println(dicc.get(5));

 //Aqui imprime las llaves, no los valores
 System.out.println(dicc.keySet());

 //Imprime el valor de un indice de otro diccionario
 System.out.println(dicc.getOrDefault(8, dicc));

 System.out.println(dicc);
    }
    
}
