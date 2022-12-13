package proyectofinal;

import java.util.TreeMap;

public class ProyectoFinal {

    public static void main(String[] args) {
        TreeMap dicc = new TreeMap();

        //Para empezar, se aniade cada valor con su respectiva llave
        dicc.put(1, "Azul");
        dicc.put(2, "Rojo");
        dicc.put(3, "Verde");
        dicc.put(4, "Negro");
        dicc.put(5, "Gris");

        //Imprimo todos los valores para que posteriormente con los metodos, los valores cambien
        System.out.println(dicc.ceilingEntry(1));
        System.out.println(dicc.ceilingEntry(2));
        System.out.println(dicc.ceilingEntry(3));
        System.out.println(dicc.ceilingEntry(4));
        System.out.println(dicc.ceilingEntry(5));
        
        //Ahora imprimo un valor en especifico
        System.out.println(dicc.ceilingEntry(4));

        //Este metodo solo regresa el numero de llave que se le asigno al valor
        System.out.println(dicc.floorKey(5));

        //Imprimo la lista de los elementos
        System.out.println(dicc);

        //Al igual que en HashMap, el metodo remove va a eliminar el valor que le solicitemos
        dicc.remove(1);

        //Imprimimos la lista para verificar que se haya eliminado el elemento deseado
        System.out.println(dicc);

        //Imprime el valor de la mayor llave
        System.out.println(dicc.higherEntry(2));

        //Imprime el valor de la menor llave
        System.out.println(dicc.lowerEntry(2));

        //Este metodo devuelve una vista de conjunto del mapa, imprime lo mismo que dos metodos atras
        System.out.println(dicc.entrySet());
    }

}
