package mv.sdd;

public class RevisionPoo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        exercice2();
    }

    public static void exercice2(){
        String [] days = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        int rand = Math.round(Math.round(Math.ceil(Math.random()*7)));
        System.out.println(rand);
        // TODO : compléter l'exercice
    }
}
