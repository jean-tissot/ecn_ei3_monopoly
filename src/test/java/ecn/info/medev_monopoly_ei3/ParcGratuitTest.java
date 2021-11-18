package ecn.info.medev_monopoly_ei3;

import org.junit.Test;

public class ParcGratuitTest {
    @Test
    public void testToString() {
        ParcGratuit parc = new Parc();
        String attendu = "Parc gratuit";
        String resultat =  this.toString();
        assertEquals(attendu,resultat);
    }
}
