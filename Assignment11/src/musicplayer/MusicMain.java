package musicplayer;

public class MusicMain {
    public static void main(String[] args) {
        CDPlayer cd = new CDPlayer();
        MP3Player mp = new MP3Player();
        StreamingPlayer sp = new StreamingPlayer();

        playMusic(cd);
        playMusic(mp);
        playMusic(sp);
    }

    private static void playMusic(Playable p) {
        p.play();
        p.pause();
        p.stop();
    }
}
