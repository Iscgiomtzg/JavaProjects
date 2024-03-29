package com;

public class Producto{
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Se agrega el constructor vacio privado
    private Producto(){
        //Asignar el ID del producto al contador
        this.idProducto = contadorProductos++;
    }

    //Constructor publico sobrecargado de dos atributos
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
    }
    
}