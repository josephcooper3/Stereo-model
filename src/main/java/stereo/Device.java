package stereo;

public class Device implements IConnect {

    public String connect(Stereo stereo) {
        return stereo.getName();
    }

}
