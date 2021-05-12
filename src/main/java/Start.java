import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    musicPlayer.playMusic(MusicEnum.CLASSICALMUSIC);
    musicPlayer.playMusic(MusicEnum.CLASSICALMUSIC);
    musicPlayer.playMusic(MusicEnum.POPMUSIC);
    musicPlayer.playMusic(MusicEnum.POPMUSIC);
    }
}