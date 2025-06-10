class MediaPlayer {
    void play() {
        System.out.println("Playing media");
    }

    void play(String fileName) {
        System.out.println("Playing media file: " + fileName);
    }

    void play(String fileName, int duration) {
        System.out.println("Playing media file: " + fileName + " for " + duration + "minutes");
    }
}

class AudioPlayer extends MediaPlayer {
    @Override
    void play() {
        System.out.println("Playing audio file");
    }
}

class VideoPlayer extends MediaPlayer {
    @Override
    void play() {
        System.out.println("Playing video file");
    }

    
}
public class Ploymorphism {
    public static void main(String[] args) {
        MediaPlayer m1 = new AudioPlayer();
        MediaPlayer m2 = new VideoPlayer();
        
        m1.play(); // Outputs: Playing audio file
        m2.play(); // Outputs: Playing video file

        MediaPlayer m3 = new MediaPlayer();
        m3.play("song.mp3"); // Outputs: Playing media file: song.mp3
        m3.play("movie.mp4", 120); // Outputs: Playing media file: movie.mp4 for 120 minutes
    }
}
