package BehavioralPatterns.TemplateMethod;

public class Pool extends Game {
    void initialize() {
        System.out.println("Pool Game Initialized! Start playing Pool.");
    }
    void startPlay() {
        System.out.println("Pool Game Started. Enjoy the game!");
    }
    void endPlay() {
        System.out.println("Pool Game Finished! Dima again win me, padla");
    }
}
