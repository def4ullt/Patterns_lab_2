package BehavioralPatterns.Template;

class Chess extends Game {
    void initialize() {
        System.out.println("Chess Game Initialized.");
    }

    void startPlay() {
        System.out.println("Chess Game Started.");
    }

    void endPlay() {
        System.out.println("Chess Game Finished.");
    }
}
