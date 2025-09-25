package mv.sdd.demo_sdd;

import java.util.Vector;

public class Vecteur {
    public static void main(String[] args) {
        Vector<String> vecteur = new Vector<>();

        vecteur.add("Alice");
        vecteur.add("Charlie");
        vecteur.add("Alain");
        vecteur.add("Bob");

        System.out.println(vecteur);
        System.out.println(vecteur.get(2));
        System.out.println(vecteur.remove("Alain"));
        System.out.println(vecteur);
    }
}
