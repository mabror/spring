package abror.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MusicPlayer {
    private Music music;
    private ClassicalMusic classicalMusic;




    @Autowired
    public void MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic= classicalMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
//        System.out.println("Playing: " + music.getSong());


    }




//    public void setMusic(String name){
//        this.name = name;
//    }

//    public String getName(){
//        return name;
//    }


//    public void setMusic(Music music) {
//        this.music = music;
//    }



}
