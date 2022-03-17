import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        List<String> team1 = new ArrayList<>();
        List<String> team2 = new ArrayList<>();
        List<String> team3 = new LinkedList<>();

        generic(team1, team2, team3);
    }

    private static void generic(List<String> team1, List<String> team2, List<String> team3) {
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

        iterator = team2.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Diego
        // Daniel
        // Cristian

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

        team3.remove(0);
        team3.remove(0); // El elemento no existe pero el programa no debe cerrarse por algún error

        team3.addAtTail("Isai");
        team3.addAtFront("Tadeo");

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

        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes"); // debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Rebeca
        // Luis
        // Yael
    }
}
