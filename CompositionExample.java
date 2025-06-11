class Speaker {
    int volume; 

    void setVolume(int vol) {
        this.volume = vol; // Using 'this' to refer to the instance variable
    }

    void playSound() {
        System.out.println("Playing sound in speaker at volume: " + volume);
    }
}

class Device {
    void powerOn() {
        System.out.println("Device is powered on");
    }
}

class MusicPlayer extends Device {
    Speaker speaker = new Speaker();// Composition: MusicPlayer has a Speaker

    
    MusicPlayer(int vol) {
        speaker.setVolume(vol);
    }
    // Default constructor
    void play() {
        super.powerOn(); // Call the method from Device
        System.out.println("Music player is playing music");
        speaker.playSound(); // Use the speaker to play sound
    }
}


public class CompositionExample {
    public static void main(String[] args) {
        MusicPlayer myMusicPlayer = new MusicPlayer(20); // Create an instance of MusicPlayer
        myMusicPlayer.play(); // Call the play method which uses the Speaker
    }
}
