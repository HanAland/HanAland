package WarGame;

/**
 *
 * @author hannah
 */


public class PlayerOfWarGame extends Player {
    
    private String name;
    private Hand hand;

    public PlayerOfWarGame(String name) {
        super(name);
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public void play() {
       
    }
}

