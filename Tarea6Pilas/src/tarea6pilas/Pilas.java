
package tarea6pilas;
import java.util.ArrayList;

public class Pilas<T> {
    ArrayList datos;
    int  tope;

    public Pilas() {
        datos = new ArrayList<>();
    }
    
    public void push (T dato){
        datos.add(dato);
        tope = datos.size()-1;
        }
    
    public boolean isEmpty(){
        return datos.size() == 0;
    }
    
    public T pop(){
        T sacado = (T) datos.remove(tope);
        tope --;
        return sacado;
    }
    
    public T peek(){
        return (T) datos.get(tope);
    }
    
    public int getLength (){    
    return datos.size();    
    }
    
    @Override
    public String toString() {
        return   "" + datos  ;
    }
    
}

