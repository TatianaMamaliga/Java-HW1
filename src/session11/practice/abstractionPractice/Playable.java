package session11.practice.abstractionPractice;

public interface Playable {

    void play();
    void stop();
}

class Music implements Playable {


    @Override
    public void play() {
        System.out.println("Musing is playing");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped");
    }
}

class Video implements Playable {

    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void stop() {
        System.out.println("Video has stopped");
    }
}
