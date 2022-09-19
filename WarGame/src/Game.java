/**
 * @author hannah
 *
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 */
public abstract class Game {

    private final String name;//the title of the game
    // the players of the game

    public Game(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
    
    public abstract void play();
    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner(Player player);

}
