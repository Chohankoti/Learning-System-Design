package Subsystems.Lights;

public class SmartLights implements Lights {

    @Override
    public void dim(int level) {
        System.out.println("Lights dimmed to " + level + "%");
    }

    @Override
    public void on() {
        System.out.println("Lights turned ON");
    }
}
