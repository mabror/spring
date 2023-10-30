package abror.springapp.config;


import abror.springapp.Music;
import abror.springapp.MusicPlayer;
import abror.springapp.genres.ClassicalMusic;
import abror.springapp.genres.KpopMusic;
import abror.springapp.genres.RockMusic;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("abror.springapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public KpopMusic kpopMusic(){
        return new KpopMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(), rockMusic(), kpopMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }


}
