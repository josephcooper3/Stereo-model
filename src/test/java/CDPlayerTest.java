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

    @Test
    public void stopsAtEndOfTracks() {
        cdPlayer.next();
        cdPlayer.next();
        cdPlayer.next();
        cdPlayer.next();
        cdPlayer.next();
        assertEquals("Track 01", cdPlayer.whatsPlaying());
    }

    @Test
    public void returnsStopMessage() {
        assertEquals("Music has stopped.", cdPlayer.stop());
    }

    @Test
    public void canGoToPreviousTrack() {
        cdPlayer.next();
        cdPlayer.next();
        cdPlayer.previous();
        assertEquals("Track 02", cdPlayer.whatsPlaying());
    }

    @Test
    public void cannotSkipBelow0(){
        cdPlayer.previous();
        assertEquals("Track 01", cdPlayer.whatsPlaying());
    }

}
