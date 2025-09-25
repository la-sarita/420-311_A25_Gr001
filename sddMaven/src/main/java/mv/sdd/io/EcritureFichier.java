package mv.sdd.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EcritureFichier {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/sortie.txt"))) {
            bw.write("Bonjour, monde !");
            bw.newLine();
            bw.write("Deuxième ligne.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}