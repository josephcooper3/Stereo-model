import org.junit.Before;
import org.junit.Test;
import stereo.Stereo;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before() {
        stereo = new Stereo();
    }

    @Test
    public void volumeStartsAt5() {
        assertEquals(5, stereo.getVolume());
    }

    @Test
    public void canIncreaseVolume() {
        stereo.increaseVolume();
        assertEquals(6, stereo.getVolume());
    }

    @Test
    public void canDecreaseVolume() {
        stereo.decreaseVolume();
        assertEquals(4, stereo.getVolume());
    }

}
