package musicplayer;

public class CDPlayer implements Playable {
    public void play() {
        System.out.println("CD player is no playing...");
    }

    public void pause() {
        System.out.println("CD player is now paused...");
    }

    public void stop() {
        System.out.println("CD player is now stopped");
    }
}
