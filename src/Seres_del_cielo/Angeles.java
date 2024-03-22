package Seres_del_cielo;

import Seres_de_la_tierra.*;

public class Angeles extends Seres_vivos implements Ser_cielo, Ser_tierra {
    String nombre_angeles, milagros_angeles;
    int edad_angeles;
    String dimension_angeles;

    public Angeles(){

    }

    public Angeles(String nombre_angeles, String milagros_angeles, int edad_angeles, String dimension_angeles) {
        this.nombre_angeles = nombre_angeles;
        this.milagros_angeles = milagros_angeles;
        this.edad_angeles = edad_angeles;
        this.dimension_angeles = dimension_angeles;
    }

    @Override
    public String toString() {
        return "Angel: " + nombre_angeles + "\n" + "Milagros: " + milagros_angeles + "\n" + "Edad: " + edad_angeles + " años \n" + "Dimension: " + dimension_angeles + "\n";
    }

    public String getNombre_angeles() {
        return nombre_angeles;
    }

    public void setNombre_angeles(String nombre_angeles) {
        this.nombre_angeles = nombre_angeles;
    }

    public String getMilagros_angeles() {
        return milagros_angeles;
    }

    public void setMilagros_angeles(String milagros_angeles) {
        this.milagros_angeles = milagros_angeles;
    }

    public int getEdad_angeles() {
        return edad_angeles;
    }

    public void setEdad_angeles(int edad_angeles) {
        this.edad_angeles = edad_angeles;
    }

    public String getDimension_angeles() {
        return dimension_angeles;
    }

    public void setDimension_angeles(String dimension_angeles) {
        this.dimension_angeles = dimension_angeles;
    }

    String cambiar_de_dimension(String Dimension){
        return "La nueva dimension es: " + Dimension;
    }

    @Override
    public void Nacer() {
        System.out.println("Naci por obra de Dios.");
    }

    @Override
    public void Crecer() {
        System.out.println("Crezco muy rapido.");
    }

    @Override
    public void Reproducirse() {
        System.out.println("Soy angel y no me reproduzco.");
    }

    @Override
    public void Respirar() {
        System.out.println("Respiro como un ser vivo cualquiera.");
    }

    @Override
    public void Morir() {
        System.out.println("Soy inmortal!!");
    }

    @Override
    public void Volar() {
        System.out.println("Vuelo porque Dios me hizo asi.");
    }

    @Override
    public void Caminar() { System.out.println("Soy un angel pero tambien camino.");
    }

    @Override
    public void Comer() {
        System.out.println("Casi no como mucho, suelo comer cada 10 años.");
    }

    @Override
    public void Correr() {
        System.out.println("No por ser angel quiere decir que no puedo correr!!");
    }

    @Override
    public void Nadar() {
        System.out.println("Casi no me gusta nadar, solo cuando alguien se ahoga y me toca salvarlo.");
    }

    @Override
    public void Dormir() {
        System.out.println("No duermo mucho porque los humanos siempre viven llamándomen.");
    }
}
