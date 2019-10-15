import org.junit.Before;
import org.junit.Test;
import stereo.CDPlayer;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Tralalala");
    }

    @Test
    public void canPlay() {
        assertEquals("Tralalala", cdPlayer.play());
    }

    @Test
    public void canGetWhatsPlaying() {
        assertEquals("Track 01", cdPlayer.whatsPlaying());
    }

    @Test
    public void canGoToNextTrack() {
        cdPlayer.next();
        assertEquals("Track 02", cdPlayer.whatsPlaying());
    }

}
