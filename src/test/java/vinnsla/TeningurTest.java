package vinnsla;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TeningurTest {

    private Teningur teningur;

    @Before
    public void newTeningur(){
        teningur = new Teningur();
    }

    @Test
    public void teningurWithinRange(){
        //Test for 100 rolls
        for(int i = 0; i < 100; i++){
            boolean withinRange = false;
            teningur.kasta();
            int value = teningur.getTening();
            if (value >= 1 && value <= 6){
                withinRange = true;
            }
            assertTrue(withinRange);
        }
    }

}
