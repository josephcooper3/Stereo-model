package stereo;

import java.util.ArrayList;
import java.util.Arrays;

public class CDPlayer extends Component {

    private ArrayList<String> trackList = new ArrayList<String>(Arrays.asList("Track 01", "Track 02", "Track 03", "Track 04", "Track 05"));
    private String currentTrack = trackList.get(0);

    public CDPlayer(String sound) {
        super(sound);
    }

    public String stop() {
        currentTrack = trackList.get(0);
        return "Music has stopped.";
    }

    public void next() {

    }

    public void previous() {

    }

    public void whatsPlaying() {

    }

}
