package ecn.info.medev_monopoly_ei3;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrisonTest {
    @Test
    public void testToString() {
        Prison prison = new Prison();
        String attendu = "Prison";
        String resultat =  prison.toString();
        assertEquals(attendu, resultat);
    }
}
