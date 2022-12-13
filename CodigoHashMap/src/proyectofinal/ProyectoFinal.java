
package proyectofinal;
import java.util.HashMap;
public class ProyectoFinal {

    
    public static void main(String[] args) {
        HashMap dicc = new HashMap();

 //Como primer paso se debe agregar cada valor un por uno con su propia llave
 dicc.put("valor 1: ", "Lunes");
 dicc.put("valor 2: ", "Martes");
 dicc.put("valor 3: ", "Miercoles");
 dicc.put("valor 4: ", "Jueves");

 //Procedo a imprimir cada valor con su propia llave en el mismo orden en que los escribi
 System.out.println(dicc.get("valor 1: "));
 System.out.println(dicc.get("valor 2: "));
 System.out.println(dicc.get("valor 3: "));
 System.out.println(dicc.get("valor 4: "));

 //Utilizo el metodo containsKey para que el programa afirme o niegue si se encuentra un valor 
 System.out.println(dicc.containsKey("valor 1: "));
 System.out.println(dicc.containsKey("valor 2: "));
 System.out.println(dicc.containsKey("valor Z: "));

 //Utilizando el metodo containsValue realizo el mismo procedimiento pero esta vez de forma inversa
 System.out.println(dicc.containsValue("Lunes"));
 System.out.println(dicc.containsValue("Jueves"));
 System.out.println(dicc.containsValue("Viernes"));

 //Este metodo va a imprimir el valor que contiene cada llave que se indique
 System.out.println(dicc.get("valor 2: "));
 System.out.println(dicc.get("valor 3: "));
 System.out.println(dicc.get("valor Z: "));

 //Con este metodo se imprime la lista
 System.out.println(dicc);

 //El metodo remove sirve para elimiar algun elemento en especifico, en este caso eliminare el segundo elemento
 dicc.remove("valor 2: ");

 //Para confirmar que se haya eliminado el elemento deseado, se vuelve a imprimir la lista
 System.out.println(dicc);
 
 //Vuelvo a eliminar otro elemento con remove
 dicc.remove("valor 4: ");
 
 //Imprimo la lista
 System.out.println(dicc);
 
 //Vuelvo a eliminar otro elemento con remove
 dicc.remove("valor 1: ");
 
 //Imprimo la lista
 System.out.println(dicc);
 
 //Elimino el ultimo elemento de la lista
 dicc.remove("valor 3: ");
 
 //Imprimo la lista
 System.out.println(dicc);
    }
    
}
