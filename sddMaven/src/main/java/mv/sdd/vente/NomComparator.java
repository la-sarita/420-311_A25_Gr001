package mv.sdd.vente;

import java.util.Comparator;

public class NomComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return o1.getNom().concat(" " +o1.getPrenom())
                .compareTo(o2.getNom().concat(" ") + o2.getPrenom());
    }
}
