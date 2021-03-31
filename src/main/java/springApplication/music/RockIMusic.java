package springApplication.music;

import org.springframework.stereotype.Component;
import springApplication.music.musicAPI.IMusic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockBean")
public class RockIMusic implements IMusic {

    @PostConstruct
    public void doInit(){
        System.out.println("Init");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        return "Что то роцкерское";
    }

}
