package vinnsla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlongurStigarTest {

       private SlongurStigar slongurStigar;

       @Before
        public void newSlongurStigar() {
           slongurStigar = new SlongurStigar();
       }

        @Test
        public void stigiMoveUp() {
            int stigi1 = slongurStigar.lendingarReitur(3, "Leikmadur");
            int stigi2 = slongurStigar.lendingarReitur(7, "Leikmadur");
            int stigi3 = slongurStigar.lendingarReitur(15, "Leikmadur");
            assertEquals(10, stigi1);
            assertEquals(18, stigi2);
            assertEquals(22, stigi3);
       }

       @Test
       public void slangaMoveDown() {
           int slanga1 = slongurStigar.lendingarReitur(8, "Leikmadur");
           int slanga2 = slongurStigar.lendingarReitur(16, "Leikmadur");
           int slanga3 = slongurStigar.lendingarReitur(23, "Leikmadur");
           assertEquals(5, slanga1);
           assertEquals(9, slanga2);
           assertEquals(14, slanga3);
       }

    @Test
    public void neitherSlangaNorStigi() {
        int reitur1 = slongurStigar.lendingarReitur(1, "Testari");
        int reitur2 = slongurStigar.lendingarReitur(4, "Testari");
        int reitur3 = slongurStigar.lendingarReitur(24, "Testari");
        assertEquals(1, reitur1);
        assertEquals(4, reitur2);
        assertEquals(24, reitur3);
    }


}

