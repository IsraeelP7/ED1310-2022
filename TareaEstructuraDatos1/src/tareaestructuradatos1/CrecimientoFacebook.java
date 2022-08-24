/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestructuradatos1;

/**
 *
 * @author israelpsiu7
 */
public class CrecimientoFacebook {
    private float mes1= (float) 0.43;
    private float mes2= 3;
    private float mes3= 2;
    private float mes4= 3;
    private float mes5= 3;
    private float mes6=4;

    public CrecimientoFacebook() {
    }

    public float getMes1() {
        return mes1;
    }

    public void setMes1(float mes1) {
        this.mes1 = mes1;
    }

    public float getMes2() {
        return mes2;
    }

    public void setMes2(float mes2) {
        this.mes2 = mes2;
    }

    public float getMes3() {
        return mes3;
    }

    public void setMes3(float mes3) {
        this.mes3 = mes3;
    }

    public float getMes4() {
        return mes4;
    }

    public void setMes4(float mes4) {
        this.mes4 = mes4;
    }

    public float getMes5() {
        return mes5;
    }

    public void setMes5(float mes5) {
        this.mes5 = mes5;
    }

    public float getMes6() {
        return mes6;
    }

    public void setMes6(float mes6) {
        this.mes6 = mes6;
    }

    @Override
    public String toString() {
        return "CrecimientoFacebook{" + "mes1=" + mes1 + ", mes2=" + mes2 + ", mes3=" + mes3 + ", mes4=" + mes4 + ", mes5=" + mes5 + ", mes6=" + mes6 + '}';
    }
    public void promedioCrec(){
        System.out.println("");
        System.out.println("Crecimiento promedio en Facebook");
        System.out.println((mes1+mes2+mes3+mes4+mes5+mes6) /6 + "% de crecimiento");
    }
 
}

    

