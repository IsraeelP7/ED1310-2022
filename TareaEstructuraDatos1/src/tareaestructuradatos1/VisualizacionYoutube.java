/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestructuradatos1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;




/**
 *
 * @author israelpsiu7
 */
public class VisualizacionYoutube {
    
    public static void main(String[] argumentos) {  
        
        
        
        
        ArrayList<String> meses = new ArrayList<>();
        ArrayList<String> meses2 = new ArrayList<>();
        
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses2.add("Enero");
        meses2.add("Febrero");
        meses2.add("Marzo");
        meses2.add("Abril");
        meses2.add("Mayo");
        meses2.add("Junio");
        
        
        
        System.out.println("Escoja el primer mes:");
        System.out.println("");
        for (String mes : meses) {
            System.out.println( mes );
            
        }
        
        System.out.println("-----------");
        Scanner teclado = new Scanner(System.in);
        
        int seleccion;
        String elMes="";
        try {
            seleccion = teclado.nextInt();
            elMes = meses.get(seleccion);
             } catch(InputMismatchException ie){
            System.out.println("Debes teclear valores numericos");
            elMes = meses.get(0);
        } catch(IndexOutOfBoundsException ioe){
            System.out.println("Error, la seleccion debe elegirse entre 0 y 5");
        } finally {
            System.out.println( elMes );
            //limpieza
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Escoja el segundo mes");
        System.out.println("");
        for (String mes2 : meses2) {
            System.out.println( mes2 );
            
        }
         
         
        System.out.println("");
        System.out.println("-----------");
        Scanner teclado2 = new Scanner(System.in);
        
        int seleccion2;
        String elMes2="";
        try {
            seleccion = teclado.nextInt();
            elMes2 = meses2.get(seleccion);
             } catch(InputMismatchException ie){
            System.out.println("Debes teclear valores numericos");
            elMes2 = meses2.get(0);
        } catch(IndexOutOfBoundsException ioe){
            System.out.println("Error, la seleccion debe elegirse entre 0 y 5");
        } finally {
            System.out.println( elMes2 );
            //limpieza
            
            
           
            System.out.println("la diferencia de visualizaciones es: ");           
 
            // no me salio la resta 
        }
        
        
        
    } 
    }
    

