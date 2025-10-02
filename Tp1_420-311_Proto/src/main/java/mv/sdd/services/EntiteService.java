package mv.sdd.services;

import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public abstract class EntiteService<T> {
    private final Class<T> classRef;  // type réel (Etudiant.class, Cours.class, etc.)

    public EntiteService(Class<T> classRef) {
        this.classRef = classRef;
    }

    /**
     * Lire les éléments de type T depuis le fichier JSON
     *
     * @return Liste de type T
     * @throws IOException
     */
    public Collection<T> chargerListe(String path) throws IOException {
        JsonService<T> jsonService = new JsonService();

        return jsonService.readList(path, classRef);
    }

    /**
     * Sauvegarder une liste d’entités dans un fichier JSON
     */
    public void sauvegarderListe(String chemin, Collection<T> liste) {
        // TODO : à implémenter
    }

    public void afficherListe(Collection<T> liste){
        // TODO : à implémenter
    }

    /**
     * Ajouter une entité dans une liste
     */
    public void ajouter(Collection<T> liste, T entite) {
        liste.add(entite);
    }

    /**
     * Supprimer une entité de la liste (en comparant avec equals)
     */
    public void supprimer(Collection<T> liste, T entite) {
        // TODO : à implémenter
    }
}
