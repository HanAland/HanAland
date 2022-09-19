import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author hannah
 * 
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 */

public class GroupOfCards {


    private final ArrayList<CardWarGame> cards = new ArrayList<>();

    GroupOfCards(){
        this.createDeck();
    }


    private void createDeck() {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards.add(new CardWarGame(r, s));
            }
        }
    }

    /**
     * Shuffles the deck so that the locations of the cards are random.
     */
    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    /**
     * @return List of type Card
     */
    public List<CardWarGame> getCards() {
        return this.cards;
    }

    /**
     * @return number of cards left in the deck
     */
    public int getCardsCount() {
        return this.cards.size();
    }

    /**
     * Deals a card from the top of the deck, removing it from the deck.
     *
     * @return a card from the end of the arrayList(Top Card)
     * @throws //EmptyDeckException @throws IllegalStateException if no more cards are left.
     */
    public CardWarGame dealCard() {
        /**if(this.cards.size() == 0){
         return  EmptyDeckException;
         }*/
        return this.cards.remove(this.cards.size() - 1);
    }

    /**
     * Adds a card to the bottom of the deck.
     *
     * @param c the card to be added to the bottom of the deck, index 0 of arraylist
     */
    public void addCard(CardWarGame c) {
        this.cards.add(0, c);
    }

    /**
     * @return a String containing all of the cards in order
     */
    @Override
    public String toString() {
        return this.cards.toString();
    }

}
    