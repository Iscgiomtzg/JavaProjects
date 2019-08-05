package com;

public class Persona {
    // private String nombre;
    // private String apellido;
    // private boolean borrado;

    private String nombre;
    private int idPersona;
    private static int contadorPersonas;

    public Persona(String nombre){
        // Cada que creamos un objeto de tipo persona el contadorPersonas incrementa para obtener un nuevo ID
        contadorPersonas++;
        // Asignamos el nuevo valor al ID
        idPersona = contadorPersonas;
        // Asignamos el nombre recibido
        this.nombre = nombre;
    }

    public Persona(){
        
    }

    public static int contadorPersonas(){
        return contadorPersonas;
    }

    // public Persona(String nombre, String apellido, boolean borrado){
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.borrado = borrado;
    // }

    // public String getNombre(){
    //     return this.nombre;
    // }
    // public void setNombre(String nombre){
    //     this.nombre = nombre;
    // }
    // public String getApellido(){
    //     return this.apellido;
    // }
    // public void setApellido(String apellido){
    //     this.apellido = apellido;
    // }
    // public boolean isBorrado(){
    //     return this.borrado;
    // }
    // public void setBorrado(boolean borrado){
    //     this.borrado = borrado;
    // }
    // public String toString(){
    //     return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nBorrado: " + this.borrado;
    // }

}