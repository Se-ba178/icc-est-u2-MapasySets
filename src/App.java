import java.util.ArrayList;
import java.util.List;

import controllers.PersonaController;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> listaPrueba = new ArrayList<>();
        listaPrueba.add(new Persona("Jose Perez", 16));

        listaPrueba.add(new Persona("Valeria Mendoza", 21));
        listaPrueba.add(new Persona("VALERIA MENDOZA", 22));
        listaPrueba.add(new Persona("Valeria Acosta", 14));

        listaPrueba.add(new Persona("Andres Vega", 32));
        listaPrueba.add(new Persona("ANDRES FLORES", 65));
        listaPrueba.add(new Persona("andres vega", 17));

        listaPrueba.add(new Persona("Camila Ortega", 20));
        listaPrueba.add(new Persona("Camila Benitez", 9));
        listaPrueba.add(new Persona("CAMILA ORTEGA", 61));

        listaPrueba.add(new Persona("Javier Flores", 28));
        listaPrueba.add(new Persona("Javier Romero", 71));
        listaPrueba.add(new Persona("javier flores", 15));

        listaPrueba.add(new Persona("Daniela Romero", 23));
        listaPrueba.add(new Persona("DANIELA SUAREZ", 11));
        listaPrueba.add(new Persona("daniela romero", 64));

        listaPrueba.add(new Persona("Kevin Acosta", 26));
        listaPrueba.add(new Persona("Kevin Zambrano", 13));
        listaPrueba.add(new Persona("KEVIN ACOSTA", 68));

        listaPrueba.add(new Persona("Paula Benitez", 24));
        listaPrueba.add(new Persona("Paula Leon", 5));
        listaPrueba.add(new Persona("PAULA BENITEZ", 80));

        listaPrueba.add(new Persona("Fernanda Salazar", 22));
        listaPrueba.add(new Persona("Fernanda Navarro", 12));
        listaPrueba.add(new Persona("FERNANDA SALAZAR", 75));

        listaPrueba.add(new Persona("Ricardo Navarro", 38));
        listaPrueba.add(new Persona("Ricardo Cordero", 90));
        listaPrueba.add(new Persona("RICARDO NAVARRO", 10));

        listaPrueba.add(new Persona("Natalia Cordero", 27));
        listaPrueba.add(new Persona("Natalia Rojas", 7));
        listaPrueba.add(new Persona("NATALIA CORDERO", 62));

        listaPrueba.add(new Persona("Esteban Rojas", 31));
        listaPrueba.add(new Persona("Esteban Villa", 18));
        listaPrueba.add(new Persona("ESTEBAN ROJAS", 73));

        listaPrueba.add(new Persona("Gabriela Leon", 25));
        listaPrueba.add(new Persona("Gabriela Alvarez", 8));
        listaPrueba.add(new Persona("GABRIELA LEON", 69));

        listaPrueba.add(new Persona("Cristian Villa", 21));
        listaPrueba.add(new Persona("Cristian Guerrero", 6));
        listaPrueba.add(new Persona("CRISTIAN VILLA", 81));

        listaPrueba.add(new Persona("Fernando Alvarez", 33));
        listaPrueba.add(new Persona("Fernando Molina", 19));
        listaPrueba.add(new Persona("FERNANDO ALVAREZ", 66));

        listaPrueba.add(new Persona("Andrea Suarez", 26));
        listaPrueba.add(new Persona("Andrea Paredes", 17));
        listaPrueba.add(new Persona("ANDREA SUAREZ", 70));

        listaPrueba.add(new Persona("Samuel Paredes", 29));
        listaPrueba.add(new Persona("Samuel Cabrera", 15));
        listaPrueba.add(new Persona("SAMUEL PAREDES", 85));

        listaPrueba.add(new Persona("Melissa Cabrera", 24));
        listaPrueba.add(new Persona("Melissa Ortega", 13));
        listaPrueba.add(new Persona("MELISSA CABRERA", 63));

        listaPrueba.add(new Persona("Oscar Zambrano", 37));
        listaPrueba.add(new Persona("Oscar Perez", 16));
        listaPrueba.add(new Persona("OSCAR ZAMBRANO", 78));

        listaPrueba.add(new Persona("Tatiana Molina", 28));
        listaPrueba.add(new Persona("Tatiana Herrera", 14));
        listaPrueba.add(new Persona("TATIANA MOLINA", 67));

        listaPrueba.add(new Persona("Brayan Guerrero", 23));
        listaPrueba.add(new Persona("Brayan Lopez", 9));
        listaPrueba.add(new Persona("BRAYAN GUERRERO", 72));

        runMetodoUno(listaPrueba);
        runMetodoDos(listaPrueba);

    }

    public static void runMetodoUno(List<Persona> listaPrueba) {
        PersonaController persona = new PersonaController();
        System.out.println(persona.filtrarYOrdenar(listaPrueba, 70));


    }

    public static void runMetodoDos(List<Persona> listaPrueba) {
        PersonaController persona = new PersonaController();
        System.out.println(persona.agruparPorRangoDeEdad(listaPrueba));

        
    }
}
