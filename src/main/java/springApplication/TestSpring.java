package springApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

      //  MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        RapMusic rapMusic = context.getBean("rapMusicBean", RapMusic.class);
        System.out.println(rapMusic.getSong());


        context.close();

    }
}
