
package mainadtcolas;
import java.util.ArrayList;

public class ADTColas<T> {
    ArrayList datos;
    int base;

    public ADTColas() {
        datos = new ArrayList<>();
    }

    public boolean isEmpty() {
        return datos.size() == 0;
    }

    public int getLength() {
        return datos.size();
    }
    
    public void enqueue( T dato ){
        datos.add(dato);
        base = 0;
    }
    public T dequeue(){
        T sacado = (T) datos.remove(base);
        return sacado;
    }
    
    @Override
    public String toString() {
        return   "" + datos  ;
    }

}

    
