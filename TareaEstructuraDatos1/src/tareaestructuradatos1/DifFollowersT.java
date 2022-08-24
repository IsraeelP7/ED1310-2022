
package tareaestructuradatos1;

import java.util.Scanner;


public class DifFollowersT {

    private int enero;
    private int junio;

    public DifFollowersT() {
    }

    public DifFollowersT(int enero, int junio) {
        this.enero = enero;
        this.junio = junio;
    }
    
    
    
    public void lectura(){
        Scanner valores= new Scanner(System.in);
        System.out.println("Ingresa los datos del primer mes: "); //62404
        enero= valores.nextInt();
        System.out.println("Ingresa los datos del segundo mes: "); // 67496
        junio= valores.nextInt();
    }
    public void diferencia(){
        System.out.println("La diferencia entre el primer y el segundo mes es: ");
        System.out.println(junio-enero + " seguidores");
    }     

    public int getEnero() {
        return enero;
    }

    public void setEnero(int enero) {
        this.enero = enero;
    }

    public int getJunio() {
        return junio;
    }

    public void setJunio(int junio) {
        this.junio = junio;
    }

    @Override
    public String toString() {
        return "DifFollowersT{" + "enero=" + enero + ", junio=" + junio + '}';
    }
    
    

    
    
}

