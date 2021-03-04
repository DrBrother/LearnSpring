package springApplication;

public class RapMusic implements  Music{

    private RapMusic (){}

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }
    @Override
    public String getSong() {
        return "Что то реперское";
    }
}
