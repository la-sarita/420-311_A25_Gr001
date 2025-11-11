package mv.sdd;

public class SeriePoo {
    public static final float TAUX_TAXE_FED = 5.0F;
    public static final float TAUX_TAXE_PROV = 9.975F;

    public static String chaineMajToMin(String chaine){
        String chaineTrans = "";

        for (int i = 0; i < chaine.length(); i++) {
            char caract = chaine.charAt(i);
            if(Character.isUpperCase(caract)){
                caract = Character.toLowerCase(caract);
            }
            chaineTrans += caract;
        }

        return chaineTrans;
    }

    public static String chaineMinToMaj(String chaine){
        String chaineTrans = "";

        for (int i = 0; i < chaine.length(); i++) {
            char caract = chaine.charAt(i);
            if(Character.isLowerCase(caract)){
                caract = Character.toUpperCase(caract);
            }
            chaineTrans += caract;
        }

        return chaineTrans;
    }

    public static String chaineSansCharSpeciaux(String chaine){
        String chaineTrans = "";

        for (int i = 0; i < chaine.length(); i++) {
            if(Character.isAlphabetic(chaine.charAt(i))
                    || Character.isDigit(chaine.charAt(i))){
                chaineTrans += chaine.charAt(i);
            }
        }

        return chaineTrans;
    }

    public static double calculerMontantAvecTaxes(double montant, boolean avecTaxeFed, boolean avecTaxeProv){
        if(montant < 0)
            throw new IllegalArgumentException("Le montant ne devrait pas être négatif.");
        if(montant == 0)
            return 0;
        float taxe = 0;
        if(avecTaxeFed)
            taxe += TAUX_TAXE_FED;
        if(avecTaxeProv)
            taxe += TAUX_TAXE_PROV;
        montant *= 1 + taxe / 100;

        return montant;
    }
}
