import com.team3.cs210finalprojectteam3.Card;
import com.team3.cs210finalprojectteam3.GameLogic;
import com.team3.cs210finalprojectteam3.Hand;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PazaakTests {

    /**
     * Tests if checkForBust(int) method correctly returns true if player score is over 20.
     * INPUTS: int 21, or any int value over 20.
     * EXPECTED OUTPUT: true.
     * @author Adnan Al Joubi
     */
    @Test
    void bustedOver20(){

        boolean result = GameLogic.getInstance().checkForBust(21);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertTrue(result);

    }

    /**
     * Tests if checkForBust(int) method correctly returns false if player score is at 20.
     * INPUTS: int 20
     * EXPECTED OUTPUT: false
     * @author Adnan Al Joubi
     */
    @Test
    void noBustAt20(){
        boolean result = GameLogic.getInstance().checkForBust(20);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertFalse(result);
    }

    /**
     * Tests if checkForBust(int) method correctly returns false if player score is under 20.
     * INPUTS: int 19, or any integer value under 20.
     * EXPECTED OUTPUT: false
     * @author Adnan Al Joubi
     */
    @Test
    void noBustUnder20(){
        boolean result = GameLogic.getInstance().checkForBust(19);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertFalse(result);
    }

    /**
     * Tests if checkForBust(int) method correctly returns false if player score is at 0.
     * INPUTS: int 0
     * EXPECTED OUTPUT: false
     * @author Adnan Al Joubi
     */
    @Test
    void noBustAtZero(){
        boolean result = GameLogic.getInstance().checkForBust(0);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertFalse(result);
    }

    /**
     * Tests if checkForBust(int) method correctly returns false if player score is negative.
     * INPUTS: int -4, or any integer value below 0
     * EXPECTED OUTPUT: false
     * @author Adnan Al Joubi
     */
    @Test
    void noBustNegativeScore(){
        boolean result = GameLogic.getInstance().checkForBust(-4);
        System.out.println("DEBUG: checkForBust result: " + result);
        assertFalse(result);
    }

    /**
     * This test checks to make sure that the Hand constructor randomizes a new list of cards for the hand
     * every time it is called.
     *
     * @author Kory Stennett
     */
    @Test
    void notSameHand(){
        Hand hand = new Hand();
        List<Card> handOneList = hand.hand;
        hand = new Hand();
        List<Card> handTwoList = hand.hand;
        boolean result = handOneList.equals(handTwoList);
        System.out.println("DEBUG: Two Lists of cards created from the same hand randomized twice are equal: "+result);
        assertFalse(result);
    }

    /**
     * This test is to essentially prove that noSameHand() is properly testing equality of hand lists.
     *
     * It should pass because both lists are made from the same hand. The important part is that
     * equals() works for checking equality of lists.
     * @author Kory Stennett
     */
    @Test
    void sameHand(){
        Hand hand = new Hand();
        List<Card> handOneList = hand.hand;
        List<Card> handTwoList = hand.hand;
        boolean result = handOneList.equals(handTwoList);
        System.out.println("DEBUG: Two Lists of cards created from the same hand are equal: "+result);
        assertTrue(result);
    }

    /**
     * The method playerOneWins() confirms that player one won the game.
     * It first compares score and assigned the number 1 if playerOne wins
     * assertEquals() expects the number 1 and checks result to confirm the winner.
     *
     * @author Prince Maduekwe
     **/
    @Test
    void playerOneWins(){
        int result = GameLogic.getInstance().compareScores(20,17);
        System.out.println("DEBUG: Check if player one won " + result);
        assertEquals(1,result);
    }

    /**
     * The method playerTwoWins() confirms that player two won the game.
     * It first compares score and assigns the number 2 if playerTwo wins.
     * assertEquals() expects the number 2 and checks result to confirm the winner.
     *
     * @author Prince Maduekwe
     **/
    @Test
    void playersTwoWins(){

        int result = GameLogic.getInstance().compareScores(12,20);
        System.out.println("DEBUG: Check if player two won " + result);
        assertEquals(2,result);

    }



    /**
     * The method playersTie() confirms that both player are tie.
     * It first compares score and assigned the 0 if the game ends in a tie.
     * assertEquals() expects the number 0 and checks result to confirm the results of the game.
     *
     * @author Prince Maduekwe
     **/
    @Test
    void playersTie(){

        int result = GameLogic.getInstance().compareScores(17,17);
        System.out.println("DEBUG: Check if both players tie " + result);
        assertEquals(0,result);

    }











}

