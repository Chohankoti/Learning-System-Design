import Subsystems.Amplifier.Amplifier;
import Subsystems.Amplifier.DolbyAmplifier;
import Subsystems.Lights.Lights;
import Subsystems.Lights.SmartLights;
import Subsystems.Projector.EpsonProjector;
import Subsystems.Projector.Projector;
import Subsystems.Streaming_Device.NetflixPlayer;
import Subsystems.Streaming_Device.StreamingDevice;

public class Main {

    public static void main(String[] args) {

        Projector projector = new EpsonProjector();
        Amplifier amplifier = new DolbyAmplifier();
        StreamingDevice streamingDevice = new NetflixPlayer();
        Lights lights = new SmartLights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                projector,
                amplifier,
                streamingDevice,
                lights
        );

        MovieRequest request = new MovieRequest(
                "Inception",
                50,
                20,
                "4K",
                "English"
        );

        homeTheater.watchMovie(request);

        System.out.println();

        homeTheater.endMovie();
    }
}