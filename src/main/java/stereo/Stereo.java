package stereo;

import java.util.ArrayList;

public class Stereo {

    private ArrayList<Component> sources;
    private Component source;
    private int volume;
    private int maxVolume;
    private int minVolume;
    private String name;

    public Stereo(String name) {
        sources = new ArrayList<Component>();
        volume = 5;
        maxVolume = 10;
        minVolume = 0;
        this.name = name;
    }

    public void addComponent(Component component) {
        if (sources.size() == 0) {
            source = component;
        }
        sources.add(component);
    }

    public Component getSource() {
        return source;
    }

    public void changeSource(Component component) {
        // change the source!
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume += 1;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume -= 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
