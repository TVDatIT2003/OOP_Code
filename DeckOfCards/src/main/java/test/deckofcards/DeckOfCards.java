/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.deckofcards;

/**
 *
 * @author acer
 */
import java.util.List;  
import java.util.Arrays; 
import java.util.Collections;

class Card {
    public static enum Face { Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King };
    public static enum Suit { Clubs, Diamonds, Hearts, Spades };
    
    private final Face face; // face of card 
    private final Suit suit; // suit of card 

    // two-argument constructor 
    public Card( Face cardFace, Suit cardSuit ) {
        face = cardFace; // initialize face of card 
        suit = cardSuit; // initialize suit of card 
    } // end two-argument Card constructor 

    // return face of the card 
    public Face getFace() { 
        return face;
    } // end method getFace 

    // return suit of Card 
    public Suit getSuit() { 
        return suit;
    } // end method getSuit 
    
    // return String representation of Card 
    public String toString() { 
        return String.format( "%s of %s", face, suit );
    }// end method toString 
} // end class Card

    //7 class DeckOfCards declaration 
public class DeckOfCards { 
    private List< Card > list; // declare List that will store Cards 

    // set up deck of Cards and shuffle 
    public DeckOfCards() {
        Card[] deck = new Card[ 52 ];
        int count = 0; // number of cards 

    // populate deck with Card objects 
    for ( Card.Suit suit : Card.Suit.values() ) { 
        for ( Card.Face face : Card.Face.values() ) { 
            deck[ count ] = new Card( face, suit );
            ++count; 
        } // end for 
    } // end for 
    
        list = Arrays.asList( deck ); // get List 
        Collections.shuffle( list ); // shuffle deck 
    } // end DeckOfCards constructor 

    // output deck 
    public void printCards() { 
        // display 52 cards in two columns 
        for ( int i = 0; i < list.size(); i++ ) 
            System.out.printf( "%-19s%s", list.get( i ), 
                    ( ( i + 1 ) % 4 == 0 ) ? "\n" : "" ); 
    } // end method printCards 
    
    public static void main(String[] args) {
        DeckOfCards cards = new DeckOfCards(); 
        cards.printCards();
    }
}