package com;

import com.sun.tools.javac.code.Attribute.Array;

public class Aritmetica {
    //Constructor
    public int a;
    public int b;
    public Aritmetica(){

    }
    //Constructor con argumentos
    // public Aritmetica(int arg1, int arg2){
    //     this.a = arg1;
    //     this.b = arg2;
    // }
    public int sumar(){
        return this.a + this.b;
    }
    public int restar(int a, int b){
        int c = a - b;
        return c;
    }
    public int dividir(int a, int b){
        int c = a / b;
        return c;
    }
    public int multiplicar(int a, int b){
        int c = a * b;
        return c;
    }
    public String parImpar(int a){
        int b = a%2;
        String resultado = "";
        if(b == 0){
            resultado = "Es par";
        } else{
            resultado = "Es impar";
        }
        return resultado;
    }
    public String primoNoPrimo(int a){
        int contador = 0;
        String resultado = "";
        for(int i = 1; i <= a; i++){
            if((a % i) == 0){
                contador++;
            }
        }
        if(contador == 2){
            resultado = "El numero es primo";
        } else{
            resultado = "El numero no es primo";
        }
        return resultado;
    }

    public String fizzBuzz(){
        String resultado = "";

        for(int i = 1; i <= 100; i++){
            if((i % 3) == 0){
                resultado += "fizz ";
            } else if((i%5) == 0){
                resultado += "buzz ";
            } else{
                resultado += i + " ";
            }
        }
        return resultado;
    }

    public int[] ordenarMayorMenor(int[] arreglo){
        return Arrays.sort(arreglo);
    }
}