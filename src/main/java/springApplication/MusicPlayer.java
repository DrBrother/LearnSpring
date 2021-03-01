package springApplication;

public class MusicPlayer {
    private Music music;

    // инверсия зависимостей
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Играет: " + music.getSong());
    }
}
