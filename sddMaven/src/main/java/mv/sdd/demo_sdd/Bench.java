package mv.sdd.demo_sdd;

import java.util.*;

public class Bench {
    public static void main(String[] args) {
        int n = 1_000_000;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) tab[i] = i;
        int cible = n - 1;

        // Recherche linéaire
        long t1 = System.nanoTime();
        rechercheLineaire(tab, cible);
        long t2 = System.nanoTime();
        System.out.println("Lineaire : " + (t2 - t1) / 1_000_000.0 + " ms");

        // Recherche binaire
        long t3 = System.nanoTime();
        rechercheBinaire(tab, cible);
        long t4 = System.nanoTime();
        System.out.println("Binaire : " + (t4 - t3) / 1_000_000.0 + " ms");
    }

    public static boolean rechercheLineaire(int[] tab, int val) {
        for (int x : tab) if (x == val) return true;
        return false;
    }

    public static boolean rechercheBinaire(int[] tab, int val) {
        int g = 0, d = tab.length - 1;
        while (g <= d) {
            int m = (g + d) / 2;
            if (tab[m] == val) return true;
            if (tab[m] < val) g = m + 1; else d = m - 1;
        }
        return false;
    }
}