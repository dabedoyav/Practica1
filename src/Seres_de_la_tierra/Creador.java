package Seres_de_la_tierra;

import Seres_del_cielo.*;


public interface Creador {
    Humanos Crear_humano (String Nombre, String RH, int id, int Edad);
    Aves Crear_ave (String nombre, String especie, String tamaño, int edad);
    Animales Crear_Animal (String Habitat, String Especie, String raza, String Nombre, int edad, String Color);
    Angeles Crear_angel (String Nombre, String Milagros, int edad, String Dimension);
}