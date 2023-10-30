package abror.springapp;
import java.util.List;
import java.util.Random;


//@Component
public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

//    private RockMusic rockMusic;
//    private ClassicalMusic classicalMusic;
//    private KpopMusic kpopMusic;
//
//    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic, KpopMusic kpopMusic) {
//        this.rockMusic = rockMusic;
//        this.classicalMusic = classicalMusic;
//        this.kpopMusic = kpopMusic;
//    }

    public String playMusic() {

        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong();






    }









//    How to use @Qualifier
//    @Autowired
//    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicalMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }




    }

//    Homework
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic){
//        this.classicalMusic= classicalMusic;
//        this.rockMusic = rockMusic;
//    }
//
//    public void playMusic(MusicGenre genre) {
//
//        Random random = new Random();
//
//        // случайное целое число между 0 и 2
//        int randomNumber = random.nextInt(3);
//
//        if (genre == MusicGenre.CLASSICAL) {
//            System.out.println(classicalMusic.getSongs().get(randomNumber));
//        } else {
//            System.out.println(rockMusic.getSongs().get(randomNumber));
//        }




//    public void setMusic(String name){
//        this.name = name;
//    }

//    public String getName(){
//        return name;
//    }


//    public void setMusic(Music music) {
//        this.music = music;
//    }




