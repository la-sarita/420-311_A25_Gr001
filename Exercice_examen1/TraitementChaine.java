package mv.sdd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class TraitementChaine {

    public static void main(String[] args) {
        String chaineDepart = "$_%5*2;-0er1bo%t?c(o(id>er7dn1eV";
        String resultat1 = "";
        String resultat2 = "";

        Stack<Character> pile = new Stack<>();
        List<Character> liste = new ArrayList<>();
        Vector<Character> vecteur = new Vector<>();
        Queue<Character> file = new LinkedList<>(); // LinkedList implémente l'interface Queue

        for (int i = 0; i < 4; i++) {
            pile.push(chaineDepart.charAt(i));
        }

        for (int i = 4; i < 8; i++) {
            liste.add(chaineDepart.charAt(i));
        }

        for (int i = 8; i < 12; i++) {
            vecteur.add(chaineDepart.charAt(i));
        }

        for (int i = 12; i < chaineDepart.length(); i++) {
            file.add(chaineDepart.charAt(i));
        }

        resultat1 += pile.pop();

        resultat1 += liste.get(1);

        for (Character c : vecteur) {
            if (Character.isDigit(c)) {
                resultat1 += c;
            } else {
                resultat2 += c;
            }
        }

        while (!file.isEmpty()) {
            Character c = file.poll();
            if (Character.isLetter(c)) {
                resultat2 += c;
            }
        }

        resultat1 = new StringBuilder(resultat1).reverse().toString();
        resultat2 = new StringBuilder(resultat2).reverse().toString();

        String resultatFinal = "";

        resultatFinal += resultat2.substring(0, 8);
        resultatFinal += " ";
        resultatFinal += resultat1.substring(0, 2);
        resultatFinal += " ";
        resultatFinal += resultat2.substring(8);
        resultatFinal += " ";
        resultatFinal += resultat1.substring(2);
        System.out.println(resultatFinal);
    }
}
