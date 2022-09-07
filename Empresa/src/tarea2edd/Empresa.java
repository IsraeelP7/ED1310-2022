package tarea2edd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import paquete1.Arreglo;
import paquete1.Empleado;

public class Empresa extends Empleado {

    public static void main(String[] args) {
        String linea;
        String datos[];
        int i = 1;
        Arreglo<Empleado> lista = new Arreglo(15);

        try {

            BufferedReader buffer = new BufferedReader(new FileReader("junio.dat"));
            linea = buffer.readLine();
            while (linea != null) {
                System.out.println(linea);
                datos = linea.split(",");
                Empleado empleado = new Empleado(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3], Integer.parseInt(datos[4]), Integer.parseInt(datos[5]), Integer.parseInt(datos[6]));
                //Se debe añadir el objeto al Arreglo del empleado con un contador para ir guardando en distintos espacios del arreglo
                lista.setElemento(i, empleado);
                i++;
                linea = buffer.readLine();
            }
            int mayor = 0;
            int menor = 0;
            for (int m = 1; m < 15; m++) {
                int n = 2;

                System.out.println(lista.getElemento(m) + " El sueldo total es = " + lista.getElemento(m).calculoDelSueldo());
                if (lista.getElemento(m).getAnioIngreso() < lista.getElemento(n).getAnioIngreso()) {

                    mayor = lista.getElemento(n).getAnioIngreso();
                    menor = lista.getElemento(m).getAnioIngreso();

                } else {
                    mayor = lista.getElemento(m).getAnioIngreso();
                    menor = lista.getElemento(n).getAnioIngreso();

                }
                n++;

            }
            int m;
            int n = 1;
            for (m = 1; m < 15; m++) {
                if (lista.getElemento(m).getAnioIngreso() == mayor) {
                    System.out.println("El empleado con mas tiempo en la empresa es :" + lista.getElemento(m)
                            + " su anio de ingreso: " + mayor);
                }
                if (lista.getElemento(n).getAnioIngreso() == menor) {
                    System.out.println("El empleado con menos tiempo en la empresa es :" + lista.getElemento(n)
                            + " su anio de ingreso: " + menor);
                }
                n++;
            }

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

}
