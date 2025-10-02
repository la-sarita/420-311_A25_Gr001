package mv.sdd.entites;

public class Enseignant extends Personne {
    private int numEmploye;
    private String courriel;
    private String local;

    public Enseignant() {
    }

    public Enseignant(int numEmploye, String courriel, String local) {
        this.numEmploye = numEmploye;
        this.courriel = courriel;
        this.local = local;
    }

    public int getNumEmploye() {
        return numEmploye;
    }

    public void setNumEmploye(int numEmploye) {
        this.numEmploye = numEmploye;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Enseignant : " + numEmploye +
                " | " + super.toString() +
                " | " + courriel +
                " | " + local;
    }
}

