package abror.springapp;


import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doign my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doign my destraction");
    }


    @Override
    public String getSong() {
        return "Rampampam";
    }
}
