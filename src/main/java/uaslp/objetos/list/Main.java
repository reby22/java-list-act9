package uaslp.objetos.list;

import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class Main {

    public static void main(String[] args)
    {
        // write your code here
        System.out.println();
        System.out.println("----------------Prueba ArrayList----------------");
        try {
            exercise(new ArrayList<>(), new ArrayList<>(), new ArrayList<>()); //Al llamado del método se le llama firma
        }catch (NotValidIndexException e){
            System.out.println();
            System.out.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }catch (NotNullValuesAllowedException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("----------------Prueba LinkedList----------------");
        try {
            exercise(new LinkedList<>(), new LinkedList<>(), new LinkedList<>());
        }catch (NotValidIndexException e){
            System.out.println();
            System.out.println("Ocurrió un error: " + e.getMessage());
        }catch (NotNullValuesAllowedException e){
            System.out.println(e.getMessage());
        }
    }

    public static void exercise(List<String> team1, List<String> team2, List<String> team3)  throws NotValidIndexException, NotNullValuesAllowedException
    {
        //team1.remove(1);
        team1.addAtTail(null);

        team1.addAtTail("Jesús");
        team1.addAtTail("Salomón");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        Iterator<String> iterator;

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Jesús
        // Salomón
        // Yael
        System.out.println();
        iterator = team2.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Diego
        // Daniel
        // Cristian

        System.out.println();
        team1.remove(0);
        team1.addAtFront("Rebeca");
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes"); // debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Rebeca
        // Salomón
        // Yael
        System.out.println();
        team2.remove(2);
        team2.addAtTail("Rita");
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes"); // debe imprimir "Team 2 tiene 3 integrantes"

        iterator = team2.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Diego
        // Daniel
        // Rita

        System.out.println();
        team3.remove(0);
        team3.remove(0); // El elemento no existe pero el programa no debe cerrarse por algún error

        team3.addAtTail("Tadeo");
        team3.addAtFront("Isai");

        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes"); // debe imprimir "Team 3 tiene 2 integrantes"

        iterator = team3.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Tadeo
        // Isai

        if(team1.getAt(1).equals("Salomón")){
            team1.setAt(1, "Luis");
        }

        System.out.println();
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes"); // debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
