package springApplication.music;

import org.springframework.stereotype.Component;
import springApplication.music.musicAPI.IMusic;

@Component("classicalBean")
public class ClassicalIMusic implements IMusic {

    @Override
    public String getSong() {
        return "Что то классическое";
    }

}
