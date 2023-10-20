package abror.springapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    //IOC
//    public MusicPlayer(Music music) {this.music = music;}

    //with setters
    public MusicPlayer() {}


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusic(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


//    public void setMusic(Music music) {
//        this.music = music;
//    }




    public void playMusic() {
        for(Music i : musicList){
            System.out.println("Playing: " + i.getSong());
        }

    }
}
