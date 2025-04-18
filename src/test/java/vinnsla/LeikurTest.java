package vinnsla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeikurTest {

    private Leikur leikur;

    @Before
    public void setUp(){
        leikur = new Leikur();
        leikur.setLeikmenn("Anna", "Bjarni");
    }

    @Test
    public void testSetLeikmenn(){
        assertEquals("Anna", leikur.getLeikmadur1().getNafn());
        assertEquals("Bjarni", leikur.getLeikmadur2().getNafn());
    }

    @Test
    public void nyrLeikurResetsPlayerReitur(){
        leikur.getLeikmadur1().setReitur(10);
        leikur.getLeikmadur2().setReitur(5);
        leikur.nyrLeikur();
        assertEquals(0, leikur.getLeikmadur1().getReitur());
        assertEquals(0, leikur.getLeikmadur2().getReitur());
        assertFalse(leikur.LeikLokidProperty().get());
        assertEquals("", leikur.getSigurvegari());
    }

    @Test
    public void leikaLeikMovesPlayer(){
        String currentName = leikur.getHverALeik();
        Leikmadur currentPlayer = currentName.equals("Anna") ?
                            leikur.getLeikmadur1() :
                            leikur.getLeikmadur2();

        int startReitur = currentPlayer.getReitur();
        leikur.leikaLeik();
        int afterReitur = currentPlayer.getReitur();

        assertTrue(afterReitur > startReitur);
    }

    @Test
    public void leikaLeikSwitchesHverALeik(){
        String currentName = leikur.getHverALeik();
        leikur.leikaLeik();
        assertNotEquals(currentName, leikur.getHverALeik());
    }

    @Test
    public void testWinningPropert() {
        leikur.hverALeikProperty().set("Anna");
        leikur.getLeikmadur1().setReitur(23);

        leikur.stillaTening(1);

        boolean leikLokid = leikur.leikaLeik();

        assertTrue(leikLokid);
        assertEquals("Anna", leikur.sigurvegariProperty().get());
        assertTrue(leikur.LeikLokidProperty().get());
    }

}
