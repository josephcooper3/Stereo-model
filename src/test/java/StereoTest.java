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

}
