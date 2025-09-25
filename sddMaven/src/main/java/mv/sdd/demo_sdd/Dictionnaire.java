package mv.sdd.demo_sdd;

import java.util.*;

public class Dictionnaire {
    public static void main(String[] args) {
//        hashMApDemo();
//        treeMapDemo();
//        linkedHashMapDemo();
        linkedHashSet();
    }

    public static void hashMApDemo(){
        HashMap<String, Integer> notes = new HashMap<>();

        notes.put("Alice", 85);
        notes.put("Alain", 95);
        notes.put("Bob", 90);

        System.out.println(notes);
        System.out.println("Note de Alice : " + notes.get("Alice"));
        System.out.println(notes.remove("Alain"));
        System.out.println(notes);

        for(Map.Entry<String, Integer> e : notes.entrySet()){
            System.out.printf("La note de %s est : %d\n", e.getKey(), e.getValue());
        }
    }

    public static void treeMapDemo(){
        TreeMap<String, Long> carnet = new TreeMap<>();

        carnet.put("Martin", 5149911589L);
        carnet.put("Alain", 5149667581L);
        carnet.put("Bob", 4389227586L);
        carnet.put("Charlie", 5145017582L);

        System.out.println(carnet);
        System.out.println("Le premier nom dans mon carnet est : " + carnet.firstKey());
        System.out.println("Le premier numéro dans mon carnet est : " + carnet.get(carnet.firstKey()));
        System.out.println("Le premier contact dans mon carnet est : " + carnet.firstEntry());
        System.out.println("Le dernier nom dans mon carnet est : " + carnet.lastKey());
        System.out.println("Le dernier contact dans mon carnet est : " + carnet.lastEntry());
    }

    public static void linkedHashMapDemo(){
        LinkedHashMap<Integer, String> historique = new LinkedHashMap<>();

        historique.put(2, "Google");
        historique.put(3, "YouTube");
        historique.put(1, "Wikipedia");
        historique.put(4, "YouTube");
        historique.put(3, "Omnivox");

        System.out.println(historique);

    }

    public static void linkedHashSet() {
        LinkedHashSet<String> courses = new LinkedHashSet<>();
        courses.add("Lait");
        courses.add("Pain");
        courses.add("Lait"); // ignoré
        courses.add("Oeufs");

        System.out.println("Liste d’achats : " + courses);
    }
}
