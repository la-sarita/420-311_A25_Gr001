package mv.sdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeriePooTest {

    @Test
    @DisplayName("Test chaine avec majuscule retourne chaine en miniscule")
    void chaineMajToMin() {
        String result = SeriePoo.chaineMajToMin("Bonjour!");
        assertEquals("bonjour!", result);
    }

    @Test
    @DisplayName("Transforme chaine en miniscule en chaine majuscule")
    void chaineMinToMaj() {
        String result = SeriePoo.chaineMinToMaj("Bonjour!");
        assertEquals("BONJOUR!", result);
    }

    @Test
    @DisplayName("Test avec chaine avec lettres et caractères spéciaux")
    void chaineAlphaSansCharSpeciaux() {
        String result = SeriePoo.chaineSansCharSpeciaux("B@nj@!r!");
        assertEquals("Bnjr", result);
    }

    @Test
    @DisplayName("Test avec chaine avec lettres, chiffres et caractères spéciaux")
    void chaineAlphaNumSansCharSpeciaux() {
        String result = SeriePoo.chaineSansCharSpeciaux("B@nj@!r!2");
        assertEquals("Bnjr2", result);
    }

    @Test
    @DisplayName("Rejette le calule pour un montant négatif")
    void claculerTaxesVenteMontantNegatif(){
        assertThrows(IllegalArgumentException.class, ()-> SeriePoo.calculerMontantAvecTaxes(-100, false, false));
    }

    @Test
    @DisplayName("Montant nul retourne 0")
    void claculerTaxesVenteMontantNull(){
        double resultat = SeriePoo.calculerMontantAvecTaxes(0, true, true);
        assertEquals(0, resultat);
    }

    @Test
    @DisplayName("Montant positif sans aucune taxe retourne le montant initial")
    void claculerTaxesVenteMontantPositifSansTaxes(){
        double resultat = SeriePoo.calculerMontantAvecTaxes(100, false, false);
        assertEquals(100, resultat);
    }

    @Test
    @DisplayName("Montant positif avec les 2 taxes")
    void claculerTaxesVenteMontantPositifAvecDeuxTaxes(){
        double resultat = SeriePoo.calculerMontantAvecTaxes(100, true, true);
        assertEquals(114.97, resultat, 0.01);
    }

    @Test
    @DisplayName("Montant positif avec taxe fédérale")
    void claculerTaxesVenteMontantPositifAvecTaxeProv(){
        double resultat = SeriePoo.calculerMontantAvecTaxes(100, true, false);
        assertEquals(109.97, resultat, 0.01);
    }

    @Test
    @DisplayName("Montant positif avec taxe provinciale")
    void claculerTaxesVenteMontantPositifAvecTaxeFed(){
        double resultat = SeriePoo.calculerMontantAvecTaxes(100, false, true);
        assertEquals(105.00, resultat, 0.01);
    }
}