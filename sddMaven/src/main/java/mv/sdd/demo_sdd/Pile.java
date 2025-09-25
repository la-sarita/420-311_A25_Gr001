package mv.sdd.demo_sdd;

import java.util.Stack;

public class Pile {
    public static void main(String[] args) {
        Stack<String> noms = new Stack<>();
        noms.push("Alex");
        noms.push("Charlie");
        noms.push("Alain");
        noms.push("Bob");

        System.out.println(noms);
        System.out.println(noms.pop());
        System.out.println(noms);
        System.out.println(noms.peek());
        System.out.println(noms);

    }
}
