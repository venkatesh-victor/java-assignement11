package musicplayer;

public class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Music is being streamed...");
    }

    public void pause() {
        System.out.println("Streaming paused...");
    }

    public void stop() {
        System.out.println("Streaming stopped...");
    }
}
