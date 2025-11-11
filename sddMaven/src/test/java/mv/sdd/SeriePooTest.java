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
    @DisplayName("Claculer montant après taxe pour un montant négatif.")
    void calculerMontantNegatifAvecTaxes(){
      assertThrows(IllegalArgumentException.class, ()-> SeriePoo.calculerMontantAvecTaxes(-50, true, true));
    }

    @Test
    @DisplayName("Claculer montant après l'application des deux taxes.")
    void calculerMontantAvecDeuxTaxes(){
        double result = SeriePoo.calculerMontantAvecTaxes(100, true, true);
        assertEquals(115, result, 0.1);
    }
}