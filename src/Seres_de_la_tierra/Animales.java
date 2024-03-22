package Seres_de_la_tierra;

public class Animales extends Seres_vivos implements Ser_tierra {

    //Atributos
    String habitat_animal;
    String especie_animal;
    String raza_animal;
    String nombre_animal;
    int edad_animal;
    String color;

    public Animales(String habitat_animal, String especie_animal, String raza_animal, String nombre_animal, int edad_animal, String color) {
        this.habitat_animal = habitat_animal;
        this.especie_animal = especie_animal;
        this.raza_animal = raza_animal;
        this.nombre_animal = nombre_animal;
        this.edad_animal = edad_animal;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre_animal + "\nEspecie: " + especie_animal + "\nHabitat: " + habitat_animal + "\n" + "Raza: " + raza_animal + "\nEdad: " + edad_animal + "\nColor: " + color + "\n";
    }

    public String getHabitat_animal() {
        return habitat_animal;
    }

    public void setHabitat_animal(String habitat_animal) {
        this.habitat_animal = habitat_animal;
    }

    public String getEspecie_animal() {
        return especie_animal;
    }

    public void setEspecie_animal(String especie_animal) {
        this.especie_animal = especie_animal;
    }

    public String getRaza_animal() {
        return raza_animal;
    }

    public void setRaza_animal(String raza_animal) {
        this.raza_animal = raza_animal;
    }

    public String getNombre_animal() {
        return nombre_animal;
    }

    public void setNombre_animal(String nombre_animal) {
        this.nombre_animal = nombre_animal;
    }

    public int getEdad_animal() {
        return edad_animal;
    }

    public void setEdad_animal(int edad_animal) {
        this.edad_animal = edad_animal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Metodos
    @Override
    public void Nacer() {
        System.out.println("Estoy naciendo..");
    }

    @Override
    public void Crecer() {
        System.out.println("Estoy en mi proceso de crecimiento");
    }

    @Override
    public void Reproducirse() {
        System.out.println("Me estoy reproduciendo :) ...");
    }

    @Override
    public void Respirar() {
        System.out.println("Respirando...");
    }

    @Override
    public void Morir() {
        System.out.println("No puede ser!! ¡¡me estoy muriendo!!");
    }

    @Override
    public void Caminar() {System.out.println("Estoy caminando, pero deseara manejar carro");}

    @Override
    public void Comer() {
        System.out.println("Me alimento con la comida que me dan...");
    }

    @Override
    public void Correr() {
        System.out.println("Me gusta correr, porque soy el mas veloz.");
    }

    @Override
    public void Nadar() {
        System.out.println("Nadando porque me gusta el agua");
    }

    @Override
    public void Dormir() {
        System.out.println("Duermo para poder descansar...");
    }
}
