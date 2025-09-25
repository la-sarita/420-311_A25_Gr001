package mv.sdd.demo_sdd;

import java.util.ArrayDeque;

public class File {
    public static void main(String[] args) {
        ArrayDeque<String> file = new ArrayDeque<>();
        file.add("Doc1");
        file.add("Doc2");
        file.add("Doc3");

        System.out.println("Déqueue : " + file.poll());
        System.out.println("Déqueue : " + file.poll());
    }
}
