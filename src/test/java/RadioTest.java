import org.junit.Before;
import org.junit.Test;
import stereo.Radio;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void canTune(){
        assertEquals("Tuned to Radio 1", radio.tune(1));
    }

}
