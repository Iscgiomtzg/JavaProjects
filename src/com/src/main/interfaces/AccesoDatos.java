package main.interfaces;

public interface AccesoDatos{
    // Buena practica: Todas las constantes van definidas en mayusculas.
    public static int MAX_REGISTROS = 10;

    // Metodo abstracto: Solo se define en el padre y se modifica el comportamiento en el hijo
    public abstract void insertar();
    public abstract void listar();
}