package springApplication;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // инверсия зависимостей
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }
    public void playMusic(){

            System.out.println("Playing: " + music.getSong());

    }

    private void initMethod(){
        System.out.println("initMethod");
    }
    private void destroyMethod(){
        System.out.println("destroyMethod");
    }
}
