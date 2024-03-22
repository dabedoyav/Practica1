package Seres_de_la_tierra;

import Seres_del_cielo.*;

public class Creador_de_seres_vivos implements Creador {

    @Override
    public Humanos Crear_humano(String Nombre1, String RH, int id, int Edad1) {
        return new Humanos(Nombre1, RH, id, Edad1);
    }

    @Override
    public Aves Crear_ave(String Nombre2, String Especie1, String Tamaño, int Edad2) {
        return new Aves(Nombre2, Especie1, Tamaño, Edad2);
    }

    @Override
    public Animales Crear_Animal(String Habitat, String Especie2, String Raza, String Nombre3, int Edad3, String Color) {
        return new Animales(Habitat, Especie2, Raza, Nombre3, Edad3, Color);
    }

    @Override
    public Angeles Crear_angel(String Nombre4, String Milagros, int Edad4, String Dimension) {
        return new Angeles(Nombre4, Milagros, Edad4, Dimension);
    }
}
