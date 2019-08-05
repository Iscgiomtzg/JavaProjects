package main.interfaces;

public class ManejoInterfaces{
    public static void main(String[] args){

        // Se crea un objeto de tipo AccesoDatos (Interfaz) Asignando el constructor de la clase ImplementacionOracle
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");

        // Al objeto datos se reasigna el constructor de la clase ImplementacionMysql
        datos = new ImplementacionMysql();
        ejecutar(datos, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equals(accion)) datos.listar();
        else if("insertar".equals(accion)) datos.insertar();
    }
}