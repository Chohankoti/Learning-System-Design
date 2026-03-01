import Subsystems.Amplifier.Amplifier;
import Subsystems.Lights.Lights;
import Subsystems.Projector.Projector;
import Subsystems.Streaming_Device.StreamingDevice;

public class HomeTheaterFacade {

    private final Projector projector;
    private final Amplifier amplifier;
    private final StreamingDevice streamingDevice;
    private final Lights lights;

    public HomeTheaterFacade(Projector projector,
                             Amplifier amplifier,
                             StreamingDevice streamingDevice,
                             Lights lights) {
        this.projector = projector;
        this.amplifier = amplifier;
        this.streamingDevice = streamingDevice;
        this.lights = lights;
    }

    public void watchMovie(MovieRequest request) {

        System.out.println("Starting movie night...");

        lights.dim(request.getLightLevel());

        projector.on();

        amplifier.on();
        amplifier.setVolume(request.getVolumeLevel());

        streamingDevice.on();
        streamingDevice.setResolution(request.getResolution());
        streamingDevice.enableSubtitles(request.getSubtitleLanguage());
        streamingDevice.play(request.getMovieName());

        System.out.println("Enjoy your movie!");
    }

    public void endMovie() {

        System.out.println("Shutting down home theater...");

        streamingDevice.off();
        amplifier.off();
        projector.off();
        lights.on();

        System.out.println("Home theater turned OFF");
    }
}