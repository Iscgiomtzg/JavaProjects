package main.interfaces;
// Todas las interfaces serán implementables
public class ImplementacionOracle implements AccesoDatos{

    // Se sobreescribirán los metodos abstractos de la interfaz implementada
    @Override
    public void insertar(){
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar(){
        System.out.println("Listar desde Oracle");
    }
}