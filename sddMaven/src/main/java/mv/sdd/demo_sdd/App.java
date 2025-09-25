package mv.sdd.demo_sdd;
import java.util.*;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Générer une grande liste de données
        int taille = 1_000_000; // 1 million d’éléments
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < taille; i++) {
            liste.add(i);
        }

        // Convertir la liste en HashSet
        Set<Integer> ensemble = new HashSet<>(liste);

        int recherche = taille - 1; // élément à chercher (dernier)

        // Recherche dans la liste (O(n))
        long debutListe = System.nanoTime();
        boolean trouveListe = liste.contains(recherche);
        long finListe = System.nanoTime();
        System.out.println("Recherche dans liste: " + trouveListe
                + " en " + (finListe - debutListe) / 1_000_000.0 + " ms");

        // Recherche dans le HashSet (O(1) en moyenne)
        long debutSet = System.nanoTime();
        boolean trouveSet = ensemble.contains(recherche);
        long finSet = System.nanoTime();
        System.out.println("Recherche dans HashSet: " + trouveSet
                + " en " + (finSet - debutSet) / 1_000_000.0 + " ms");


    }
}
