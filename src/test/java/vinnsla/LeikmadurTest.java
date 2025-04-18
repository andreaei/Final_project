package vinnsla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeikmadurTest {

    private Leikmadur leikmadur;

    @Before
    public void newLeikmadur(){
        leikmadur = new Leikmadur("Anna");
    }

    @Test
    public void getLeikmadur() {
        assertEquals("Anna", leikmadur.getNafn());
        assertEquals(0, leikmadur.getReitur());
    }

    @Test
    public void setAndGetNafn() {
        leikmadur.setNafn("Bjarni");
        assertEquals("Bjarni", leikmadur.getNafn());
    }

    @Test
    public void setAndGetReitur() {
        leikmadur.setReitur(5);
        assertEquals(5, leikmadur.getReitur());
    }

    @Test
    public void faeraBelowMax(){
        leikmadur.faera(3,10);
        assertEquals(3, leikmadur.getReitur());
    }

    @Test
    public void faeraAlmostMax(){
        leikmadur.faera(9,10);
        assertEquals(9, leikmadur.getReitur());
    }

    @Test
    public void faeraMax(){
        leikmadur.faera(10,10);
        assertEquals(10, leikmadur.getReitur());
    }

    @Test
    public void faeraAboveMax(){
        leikmadur.faera(15,10);
        assertEquals(10, leikmadur.getReitur());
    }
}
