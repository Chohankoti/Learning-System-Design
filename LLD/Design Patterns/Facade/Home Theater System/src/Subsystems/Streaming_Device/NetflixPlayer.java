package Subsystems.Streaming_Device;

public class NetflixPlayer implements StreamingDevice {

    @Override
    public void on() {
        System.out.println("Streaming device turned ON");
    }

    @Override
    public void setResolution(String resolution) {
        System.out.println("Resolution set to " + resolution);
    }

    @Override
    public void enableSubtitles(String language) {
        System.out.println("Subtitles enabled in " + language);
    }

    @Override
    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    @Override
    public void off() {
        System.out.println("Streaming device turned OFF");
    }
}
