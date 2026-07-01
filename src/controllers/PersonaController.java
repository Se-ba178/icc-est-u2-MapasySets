package controllers;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Persona;

public class PersonaController {

    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edad) {
        Set<Persona> personaFiltrada = new TreeSet<>(
                (p1, p2) -> {
                    int compEdad = Integer.compare(p1.getEdad(), p2.getEdad());
                    if (compEdad != 0) {
                        return compEdad;
                    }
                    return p1.getNombre().compareToIgnoreCase(p2.getNombre());

                });
        for (Persona persona : personas) {
            if (persona.getEdad() >= edad) {
                personaFiltrada.add(persona);
            }
        }

        return personaFiltrada;

    }

    public Map<String, Set<String>> agruparPorRangoDeEdad(List<Persona> personas) {
        Map<String, Set<String>> personasAgrupadas = new TreeMap<>();

        System.out.println("-----------------------");
        for (Persona persona : personas) {

            String grupo = ""; 
  
            
            if (persona.getEdad() < 18) {
                grupo = "JOVEN";
            } else if (persona.getEdad() < 60) {
                grupo = "ADULTO";
            } else {
                grupo = "MAYOR";
            }

            String nombre = persona.getNombre().split(" ")[0];
            personasAgrupadas.putIfAbsent(grupo, new TreeSet<>());
            personasAgrupadas.get(grupo).add(nombre);
        }

        return personasAgrupadas;

    }

}