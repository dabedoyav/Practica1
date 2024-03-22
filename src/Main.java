import Seres_de_la_tierra.*;
import Seres_del_cielo.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creacion de seres vivos.");
        Scanner lector = new Scanner(System.in);

        //Variables a usar
        int opcion_seres_vivos = 0;
        String Nombre, Dimension,Milagros, Habitat, Especie, Raza, Color, RH, Tamaño;
        int Edad, id, continuar;
        continuar = 0;
        // Objetos de clases para guardar los datos del creador
        Humanos humano_creado;
        Angeles Angel_creado;
        Aves Ave_creada;
        Animales Animal_creado;

        //Creador de instancias
        Creador creador1 = new Creador_de_seres_vivos();

        do {
            System.out.println("Ingrese la opcion del ser vivo que desea crear: \n1. Humano.\n2. Animal.\n3. Angel.\n4. Ave.\n");
            opcion_seres_vivos = lector.nextInt();
            switch (opcion_seres_vivos) {
                case 1:
                    System.out.println("Ingrese los datos del humano a crear.");
                    System.out.println("Nombre:");
                    Nombre = lector.next();
                    System.out.println("RH:");
                    RH = lector.next();
                    System.out.println("Edad:");
                    Edad = lector.nextInt();
                    System.out.println("ID:");
                    id = lector.nextInt();
                    humano_creado = creador1.Crear_humano(Nombre, RH, id, Edad);
                    System.out.println("\nLos datos creados son:");
                    humano_creado.Nacer();
                    System.out.println(humano_creado.toString());
                    humano_creado.Crecer();
                    humano_creado.Reproducirse();
                    humano_creado.Volar();
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Ingrese los datos del animal a crear.");
                    System.out.println("Nombre:");
                    Nombre = lector.next();
                    System.out.println("Especie:");
                    Especie = lector.next();
                    System.out.println("Habitat:");
                    Habitat = lector.next();
                    System.out.println("Raza:");
                    Raza = lector.next();
                    System.out.println("Edad:");
                    Edad = lector.nextInt();
                    System.out.println("Color:");
                    Color = lector.next();
                    Animal_creado = creador1.Crear_Animal(Habitat, Especie, Raza, Nombre, Edad, Color);
                    System.out.println("\nLos datos creados son:");
                    Animal_creado.Nacer();
                    System.out.println(Animal_creado.toString() + "\n");
                    Animal_creado.Correr();
                    Animal_creado.Morir();
                    break;

                case 3:
                    System.out.println("Ingrese los datos del angel a crear.");
                    System.out.println("Nombre:");
                    Nombre = lector.next();
                    System.out.println("Milagros:");
                    Milagros = lector.next();
                    lector.nextLine();
                    System.out.println("Dimension:");
                    Dimension = lector.next();
                    System.out.println("Edad:");
                    Edad = lector.nextInt();
                    Angel_creado = creador1.Crear_angel(Nombre, Milagros, Edad, Dimension);
                    System.out.println("\nLos datos creados son:");
                    Angel_creado.Nacer();
                    System.out.println(Angel_creado.toString() + "\n");
                    System.out.println("Cambie de dimension al angel:");
                    Dimension = lector.next();
                    Angel_creado.setDimension_angeles(Dimension);
                    System.out.println(Angel_creado.toString() + "\n");
                    Angel_creado.Morir();
                    Angel_creado.Volar();
                    Angel_creado.Dormir();
                    break;

                case 4:
                    System.out.println("Ingrese los datos del ave a crear.");
                    System.out.println("Nombre:");
                    Nombre = lector.next();
                    System.out.println("Especie:");
                    Especie = lector.next();
                    System.out.println("Tamaño:");
                    Tamaño = lector.next();
                    System.out.println("Edad:");
                    Edad = lector.nextInt();
                    Ave_creada = creador1.Crear_ave(Nombre, Especie, Tamaño, Edad);
                    System.out.println("\nLos datos creados son:");
                    Ave_creada.Nacer();
                    System.out.println(Ave_creada.toString() + "\n");
                    Ave_creada.Volar();
                    Ave_creada.Comer();
                    break;
                default:
                    System.out.println("Seleccione un opcion correcta.");
                    break;
            }
            System.out.println("Desea ingresar otro ser?\n1. Si.\n2. No.");
            continuar = lector.nextInt();
        } while (continuar == 1);

    }
}