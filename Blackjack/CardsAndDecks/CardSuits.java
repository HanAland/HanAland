package Blackjack.CardsAndDecks;

/**
 * Enum of card suits.
 *
 * @author Hannah
 */
public enum CardSuits {
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs"),
    SPADES("Spades");

    private String suitValue;

    private CardSuits(String value) {
        this.suitValue = value;
    }
    
    public String getValue() {
        return this.suitValue;
    }
}