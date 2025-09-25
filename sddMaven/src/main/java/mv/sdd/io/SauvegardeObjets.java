package mv.sdd.io;

import java.io.*;
import java.util.ArrayList;

public class SauvegardeObjets {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/serialize.txt"))) {
            ArrayList<String> liste = new ArrayList<>();
            liste.add("Alice");
            liste.add("Bob");
            out.writeObject(liste);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
