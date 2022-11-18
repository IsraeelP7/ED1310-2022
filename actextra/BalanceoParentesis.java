
package actextra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class BalanceoParentesis {   
    private String texto1txt;
    private String linea;
    private PilasActExtra <Character> lista = new PilasActExtra();
    private int cont1=0;
    private int cont2=0;
    
    
    public BalanceoParentesis (String texto1txt){
        this.texto1txt = texto1txt;
    }
    
    public String balanceo() throws FileNotFoundException, IOException{
        BufferedReader buffer = new BufferedReader(new FileReader(texto1txt));
        
        linea = buffer.readLine();
        while (linea != null) {
            
            System.out.println(linea);
            char[] letras = linea.toCharArray();
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == '(') {
                    lista.push('(');
                    cont1++;

                } else if (letras[i] == ')') {
                    if (!lista.isEmpty()) {
                        lista.pop();
                        cont2++;
                    }
                }
            }
            linea = buffer.readLine();
        }
        if (lista.isEmpty()) {
            return "\nResulatdo: Los parentesis estan balanceados adecuadamente  \n" + "Los parentesis que estan abiertos son : " + cont1 + "\n"+ "Los parentesis que estan cerrados son : " + cont2 + "\n";

        } else {
            return "\nResultado: Los parentesis no estan balanceados adecuadamente \n" +
            "Los parentesis que estan abiertos son : " + cont1 + "\n"+
            "Los parentesis que estan cerrados son : " + cont2 + "\n\n";

        }
    }


public class PilasActExtra <T> {
    
    ArrayList datos;
    int  tope;

    public PilasActExtra() {
        datos = new ArrayList<>();
    }
    
    public void push (T dato){
        
        datos.add(dato);
        tope = datos.size()-1;
        
    }
    
    public T pop(){
        T sacado = (T) datos.remove(tope);
        tope --;
        return sacado;
    }
    
    public int getLength (){
            return datos.size();
    }
    
    public boolean isEmpty(){
        return datos.size() == 0;
    }
     
    
    public T peek(){
        return (T) datos.get(tope);
    }
    
    @Override
    public String toString() {
        return   "" + datos  ;
    }
    
}
}

   


    

