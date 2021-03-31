package springApplication.music;

import org.springframework.stereotype.Component;
import springApplication.music.musicAPI.IMusic;

@Component("rapBean")
public class RapIMusic implements IMusic {

    @Override
    public String getSong() {
        return "Что то реперское";
    }

}
