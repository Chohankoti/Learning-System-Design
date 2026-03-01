package Subsystems.Projector;

public class EpsonProjector implements Projector {

    @Override
    public void on() {
        System.out.println("Projector turned ON");
    }

    @Override
    public void off() {
        System.out.println("Projector turned OFF");
    }
}