package stereo;

public abstract class Component {

    private String sound;

    public Component(String sound) {
        this.sound = sound;
    }

    public String play() {
        return sound;
    }

    public String stop() {
        return "Music has stopped.";
    }


    public abstract void next();
    public abstract void previous();
    public abstract void whatsPlaying();



}
