package abror.springapp.genres;

import abror.springapp.Music;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {


//    @PostConstruct
//    public void doMyInit() {
//        System.out.println("Doing my initilization");
//    }

//    @PreDestroy
//    public void doMyDestroy() {
//        System.out.println("Doing my destroy");
//    }

    @Override
    public String getSong() {
        return "Numb";
    }


}




// Homework
//    private List<String> songs = new ArrayList<>();
//
//// Блок инициализации объекта (англ. Instance initialization block)
//// Выполняется каждый раз, когда создается объект класса
//    {
//            songs.add("Wind cries Mary");
//            songs.add("Paint it black");
//            songs.add("Can't seem to make you mine");
//            }
//
//@Override
//public List<String> getSongs() {
//        return songs;
//        }