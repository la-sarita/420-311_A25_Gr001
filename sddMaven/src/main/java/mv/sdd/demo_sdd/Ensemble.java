package mv.sdd.demo_sdd;

import java.util.HashSet;
import java.util.TreeSet;

public class Ensemble {
    public static void main(String[] args) {
//        hashSetDemo();
        treeSetDemo();
    }

    public static void hashSetDemo(){
        HashSet<String> noms = new HashSet<>();

        noms.add("Alice");
        noms.add("Bob");
        noms.add("Alice");

        System.out.println(noms);

    }

    public static void treeSetDemo(){
        TreeSet<Integer> notes = new TreeSet<>();

        notes.add(85);
        notes.add(90);
        notes.add(70);
        notes.add(90);

        System.out.println(notes);
    }
}
