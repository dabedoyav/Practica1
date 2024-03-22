package Seres_del_cielo;

import Seres_de_la_tierra.*;

public class Aves extends Seres_vivos implements Ser_cielo, Ser_tierra {
    String nombre_aves, especie_aves, tamaño_aves;
    int edad_aves;

    public Aves(){

    }

    public Aves(String nombre_aves, String especie_aves, String tamaño_aves, int edad_aves) {
        this.nombre_aves = nombre_aves;
        this.especie_aves = especie_aves;
        this.tamaño_aves = tamaño_aves;
        this.edad_aves = edad_aves;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre_aves + "\nEspecie: " + especie_aves + "\nTamaño: " +  tamaño_aves + "\nEdad: " + edad_aves + "\n";
    }

    public String getNombre_aves() {
        return nombre_aves;
    }

    public void setNombre_aves(String nombre_aves) {
        this.nombre_aves = nombre_aves;
    }

    public String getEspecie_aves() {
        return especie_aves;
    }

    public void setEspecie_aves(String especie_aves) {
        this.especie_aves = especie_aves;
    }

    public String getTamaño_aves() {
        return tamaño_aves;
    }

    public void setTamaño_aves(String tamaño_aves) {
        this.tamaño_aves = tamaño_aves;
    }

    public int getEdad_aves() {
        return edad_aves;
    }

    public void setEdad_aves(int edad_aves) {
        this.edad_aves = edad_aves;
    }

    @Override
    public void Nacer() {
        System.out.println("Naci y aun no tengo plumas.");
    }

    @Override
    public void Crecer() {
        System.out.println("Estoy creciendo y mama me alimenta.");
    }

    @Override
    public void Reproducirse() {
        System.out.println("Quiero una pareja para reproducirme.");
    }

    @Override
    public void Respirar() {
        System.out.println("Respiro porque de lo contrario me muero.");
    }

    @Override
    public void Morir() {
        System.out.println("Me muero lentamente si no me alimento.");
    }

    @Override
    public void Volar() {
        System.out.println("Me encanta volar, aprendi hace poco.");
    }

    @Override
    public void Caminar() {System.out.println("Camino, pero lo hago muy poco.");}

    @Override
    public void Comer() {
        System.out.println("Como poco porque soy un ser muy pequeño.");
    }

    @Override
    public void Correr() {
        System.out.println("No suelo correr mucho porque me gusta mas volar.");
    }

    @Override
    public void Nadar() {
        System.out.println("Soy un mal nadador porque se me mojan las plumas.");
    }

    @Override
    public void Dormir() {
        System.out.println("Duermo para descansar mis plumas");
    }
}
