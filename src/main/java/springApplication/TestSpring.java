package springApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("Громкость "+ musicPlayer.getVolume());
        System.out.println("Громкость "+ musicPlayer1.getVolume());

        musicPlayer.setVolume(30);
      //  musicPlayer.playMusic();
        System.out.println("Громкость "+ musicPlayer.getVolume());
        System.out.println("Громкость "+ musicPlayer1.getVolume());

        context.close();

    }
}
