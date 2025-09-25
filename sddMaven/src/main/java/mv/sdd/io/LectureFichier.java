package mv.sdd.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichier {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data/fichier.txt"))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
