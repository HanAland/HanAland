package Blackjack.Game;

/**
 * main class that runs the entire program.
 *
 * @author Hannah
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameView view = new GameView();
        view.setup();
        view.explainRules();
        view.play();
    }

}