package futbol;

import java.util.Objects;

public class Futbolista {
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista(){
        this("Maradona", 30, "delantero");
    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;

    }
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


    //fin getter and setter

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad +
                " y juega de posicion   " + posicion;
    }




    public boolean equals(Futbolista futbolista){
        if (futbolista.getNombre().equals(this.getNombre()) &&
            futbolista.getEdad() == this.getEdad() &&
            futbolista.getPosicion().equals(this.getPosicion())){
            return true;
        } else {
            return false;
        }
    }




}
