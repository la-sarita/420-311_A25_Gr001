package mv.sdd;

import mv.sdd.entites.Enseignant;
import mv.sdd.services.EnseignantService;
import mv.sdd.utils.Constants;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/**
 * Ce projet est un projet prototype pour vous aider à démarrer le projet
 * Quelques indications sont mentionnées dans les commentaires, mais pas toutes
 * Vous devez vous référez à l'énoncé
 * Le code fourni dans l'énoncé n'est pas forcément le code que vous allez remettre.
 * Il s'agit d'exemple. Même les classes fournies dans le TP sont des classes
 * à titre d'exemple. Des ajustements restent nécessaires au besoin.
 * Les signatures des méthodes attendues sont indiquées dans l'énoncé.
 */
public class App 
{
    // Exemple d'initialisation d'un service
    static EnseignantService enseignantService = new EnseignantService(Enseignant.class);
    // TODO : Ajouter le reste des services

    // Exemple de déclaration d'une collection dans laquelle on va charger les enseignants lus à partir d'enseignant.json
    static Collection<Enseignant> enseignantsList;
    // TODO : Ajouter la déclaration le reste des collections

    // TODO : Ajouter la déclaration de d'autres structures au besoin


    // TODO : Remplacer le contenu de la méthode main par votre code
    public static void main( String[] args )
    {
        System.out.println(Constants.MENU);
        // Exemple de chargerment d'un fichier json dans une collection puis son affichage
        // Ce code ne représente pas ce qui est demandé
        // Les classes ne sont pas complètes et nécessitent des ajustements
        // tel qu'écrire la méthode toString selon l'affichage attendu et
        // ajouter d'autres si nécessaire.
        // Il manque l'implémentation des classes et des services
        // au besoin ajouter des classes pour des Comparators externes.
        // Le code fourni dans ce projet est un prototype à titre d'exemple
        // Il ne constitue pas la solution finale et des ajustements sont requis.
        try {
            enseignantsList = enseignantService.chargerListe(Constants.ENSEIGNANTS_PATH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Iterator<Enseignant> it = enseignantsList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    // TODO : organiser le code de chaque option du menu dans une méthode
    // ajouter une méthode pour charger les données à partir des fichiers Json dans vos Collections
    // ajouter une méthode qui sera appeler dans l'option 1 du switch .. case
    // ...
    // ajouter une méthode qui sera appeler dans l'option 11 du switch

    // Vous pouvez ajouter des méthodes secondaires qui seront appelées par les 11 autres méthodes au besoin
    // factoriser le code redendant en respectant le principe DRY
}
