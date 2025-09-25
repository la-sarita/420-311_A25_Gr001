package mv.S3_420_311;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        exemple1();
        // exemple2();
    }

    public static void exemple1(){
        LinkedList nombres = new LinkedList<>(); // => // LinkedList<Integer> nombres = new LinkedList<>();
        nombres.addFirst(10);
        nombres.addLast(20);
        nombres.addLast(30);
        nombres.addLast(40);
        nombres.addFirst(50);
        nombres.removeLast();
        nombres.removeFirst();
        System.out.println(nombres);
        System.out.println(nombres.size());
        System.out.println(nombres.contains(20));
        System.out.println(nombres.indexOf(20));
        var tab = nombres.toArray();
        System.out.println(Arrays.toString(tab));

        //Iterating LinkedList
        Iterator<Integer> iterator = nombres.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void exemple2(){
        LinkedList<String> cars = new LinkedList<>();

        // Ajouts
        cars.add("Audi");       // fin
        cars.addFirst("Toyota");   // début
        cars.addLast("Ford");     // fin
        System.out.println("Liste : " + cars);

        // Accès
        System.out.println("Premier : " + cars.getFirst());
        System.out.println("Dernier : " + cars.getLast());
        System.out.println("Index 1 : " + cars.get(1));

        // Suppressions
        cars.removeFirst();
        cars.removeLast();
        System.out.println("Après suppressions : " + cars);

        // Utilisation comme pile
        cars.push("Honda");
        System.out.println("Après push : " + cars);
        System.out.println("Pop → " + cars.pop());

        // Utilisation comme file
        cars.offer("Opel");
        System.out.println("Après offer : " + cars);
        System.out.println("Poll → " + cars.poll());
    }
}
