package com;

public class Animalitos{
    private String come;
    private String bebe;
    private Integer edad;

    public Animalitos( String come, String bebe, Integer edad){
        this.come = come;
        this.bebe = bebe;
        this.edad = edad;
    }

    public String obtieneAnimalitos(){
        return "El animal come: " + come + ", El animal bebe: " + bebe + ", El animal tiene: " + edad + " años";
    }
}
