package musicplayer;

public class MP3Player implements Playable {
    public void play() {
        System.out.println("MP3 player is now playing...");
    }

    public void pause() {
        System.out.println("MP3 player is no paused...");
    }

    public void stop() {
        System.out.println("MP3 player is stopped...");
    }
}
