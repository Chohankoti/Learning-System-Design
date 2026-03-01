package Subsystems.Streaming_Device;

public interface StreamingDevice {
    void on();
    void setResolution(String resolution);
    void enableSubtitles(String language);
    void play(String movie);
    void off();
}