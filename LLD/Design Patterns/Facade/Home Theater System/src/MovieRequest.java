public class MovieRequest {

    private final String movieName;
    private final int volumeLevel;
    private final int lightLevel;
    private final String resolution;
    private final String subtitleLanguage;

    public MovieRequest(String movieName,
                        int volumeLevel,
                        int lightLevel,
                        String resolution,
                        String subtitleLanguage) {

        this.movieName = movieName;
        this.volumeLevel = volumeLevel;
        this.lightLevel = lightLevel;
        this.resolution = resolution;
        this.subtitleLanguage = subtitleLanguage;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getLightLevel() {
        return lightLevel;
    }

    public String getResolution() {
        return resolution;
    }

    public String getSubtitleLanguage() {
        return subtitleLanguage;
    }
}