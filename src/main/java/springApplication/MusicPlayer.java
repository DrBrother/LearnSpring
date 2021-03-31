package springApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springApplication.music.musicAPI.IMusic;

@Component
public class MusicPlayer {

    private IMusic IMusic1;
    private IMusic IMusic2;

    @Autowired
    public MusicPlayer(@Qualifier("rapBean") IMusic IMusic1, @Qualifier("rockBean") IMusic IMusic2) {
        this.IMusic1 = IMusic1;
        this.IMusic2 = IMusic2;
    }

    public String playMusic(){
           return "Playing: " + IMusic1.getSong() + ", " + IMusic2.getSong();

    }

}
