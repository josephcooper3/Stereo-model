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
        return super.stop();
    }

    public void next() {
        int i = trackList.indexOf(currentTrack);
        if (i == trackList.size() - 1) {
            stop();
        } else {
            currentTrack = trackList.get(i + 1);
        }
    }

    public void previous() {
        int i = trackList.indexOf(currentTrack);
        if (i != 0){
            currentTrack = trackList.get(i - 1);
        }
    }

    public String whatsPlaying() {
        return currentTrack;
    }

}
