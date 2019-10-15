import org.junit.Before;
import org.junit.Test;
import stereo.CDPlayer;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer();
    }

    @Test
    public void canPlay(){
        assertEquals("Tralalala", cdPlayer.play());
    }

}
