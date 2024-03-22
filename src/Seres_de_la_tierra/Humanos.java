package Seres_de_la_tierra;

import Seres_del_cielo.Ser_cielo;

public class Humanos extends Seres_vivos implements Ser_tierra, Ser_cielo {

    // Atributos
    String nombre_humano;
    String rh_humano;
    int id_humano;
    int edad_humano;

    public Humanos(){

    }

    public Humanos(String nombre_humano, String rh_humano, int id_humano, int edad_humano) {
        this.nombre_humano = nombre_humano;
        this.rh_humano = rh_humano;
        this.id_humano = id_humano;
        this.edad_humano = edad_humano;
    }

    @Override
    public String toString() {
        return "Humano: " + nombre_humano + "\n" + "Edad: " + edad_humano + "\n" + "ID: " + id_humano + "\n" + "RH: " + rh_humano;
    }

    public String getNombre_humano() {
        return nombre_humano;
    }

    public void setNombre_humano(String nombre_humano) {
        this.nombre_humano = nombre_humano;
    }

    public String getRh_humano() {
        return rh_humano;
    }

    public void setRh_humano(String rh_humano) {
        this.rh_humano = rh_humano;
    }

    public int getId_humano() {
        return id_humano;
    }

    public void setId_humano(int id_humano) {
        this.id_humano = id_humano;
    }

    public int getEdad_humano() {
        return edad_humano;
    }

    public void setEdad_humano(int edad_humano) {
        this.edad_humano = edad_humano;
    }

    // Metodos
    @Override
    public void Nacer() {
        System.out.println("Acabo de nacer");
    }

    @Override
    public void Crecer() {
        System.out.println("Cada dia soy mas grande");
    }

    @Override
    public void Reproducirse() {
        System.out.println("Deseo tener muchos hijos");
    }

    @Override
    public void Respirar() {
        System.out.println("Respirando ando...");
    }

    @Override
    public void Morir() {
        System.out.println("Vi la luz");
    }

    @Override
    public void Caminar() {System.out.println("Camino por salud");}

    @Override
    public void Comer() {
        System.out.println("Comiendo ");
    }

    @Override
    public void Correr() {
        System.out.println("Corriendo");
    }

    @Override
    public void Nadar() {
        System.out.println("Nadando ando");
    }

    @Override
    public void Dormir() {
        System.out.println("Zzz");
    }

    @Override
    public void Volar() {
        System.out.println("Soy un humano y estoy volando en avion.");
    }
}
