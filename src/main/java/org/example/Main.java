
package org.example;

import herencias.Camion;
import herencias.Coche;
import herencias.Moto;
import herencias.Vehiculo;
import herencias.Race;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        List<Vehiculo> peloton = List.of(new Camion("Camion"), new Coche("Coche"), new Moto("moto"));
        startRace(peloton);

        Race race = new Race(peloton);
        race.start();

    }

    public static void startRace(List<Vehiculo> peloton) {
        for (Vehiculo vehiculo : peloton) {
            vehiculo.acelerar();
            System.out.println(vehiculo);


        }
    }


}
