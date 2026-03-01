package Subsystems.Amplifier;

public class DolbyAmplifier implements Amplifier {

    @Override
    public void on() {
        System.out.println("Amplifier turned ON");
    }

    @Override
    public void setVolume(int level) {
        System.out.println("Volume set to " + level);
    }

    @Override
    public void off() {
        System.out.println("Amplifier turned OFF");
    }
}
