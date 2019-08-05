import java.util.Scanner;

import com.Animalitos;
import com.Orden;
import com.Persona;
import com.Producto;

public class Main{
    public static void main(String[] args){
        /**
         * Metodo con multiples argumentos
         */
        // multiplesArgumentos(1, 2, 3, 4, 5, 6, 8);

        System.out.println("Valor 1: " + Dias.LUNES);
        indicaDias(Dias.MARTES);
    }

    public static void indicaDias(Dias dias){
        switch(dias){
            case LUNES:
            System.out.println("Primer dia de la semana");
            break;
            default:
            System.out.println("Nada definido");
            break;
        }
    }


    /**
     * Multiples argumentos en un metodo
     * @param args
     */
    // public static void multiplesArgumentos(int... args){
    //     for (int var : args) {
    //         System.out.println(var);
    //     }
    // }
    
    public enum Dias {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}