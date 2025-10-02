package mv.sdd.utils;

public class Constants {
    public static final String ETUDIANTS_PATH = "data/etudiants.json";
    public static final String ENSEIGNANTS_PATH = "data/enseignants.json";
    public static final String COURS_PATH = "data/cours.json";
    public static final String GROUPES_PATH = "data/groupes.json";
    public static final String SEPARATEUR = "=============================================\n";
    public static final String MENU = "\n==================== MENU ====================\n" +
            "1. Ajouter un étudiant à la liste des étudiants\n" +
            "2. Ajouter une note d'un cours à un étudiant\n" +
            "3. Afficher les moyennes générales des groupes\n" +
            "4. Afficher les 5 meilleurs étudiants d’un groupe\n" +
            "5. Afficher les 5 plus faibles étudiants d’un groupe\n" +
            "6. Afficher les étudiants d’un groupe triés par leurs 'nom prenom'\n" +
            "7. Rechercher un étudiant par son numéro de DA\n" +
            "8. Affiche le relevé de notes d'un étudiant\n" +
            "9. lister les cours suivis par les étudiants d'un groupe\n" +
            "10. lister les étudiants inscrits\n" +
            "11. Sauvegarder les données\n" +
            "0. Quitter\n";
    public static final String ETUDIANT_INEXISTANT = "Il n'y a aucun étudiant avec le numero de DA : %d\n";
    public static final String SAISI_NOM_GROUPE = "Entrez le nom du groupe : ";
    public static final String SAISI_NUM_DA = "Entrez le numero de DA : ";
    public static final String SAISI_NOM_ETUDIANT = "Entrez le nom de l'étudiant : ";
    public static final String SAISI_PRENOM_ETUDIANT = "Entrez le prénom de l'étudiant : ";
    public static final String SAISI_NOTE_ETUDIANT = "Entrez la note : ";
    public static final String SAISI_SIGLE_COURS = "Entrez le sigle du cours : ";
    public static final String MSG_DONNEES_SAUVEGARDEES = "Données sauvegardées !";
    public static final String MSG_ERR_ENTREE_INVALIDE = "Option invalide!";
    public static final int NBR_ETUD_SELECT_MEILLEUR_FAIBLE = 5;
    // TODO: Ajouter le reste des constantes
}
