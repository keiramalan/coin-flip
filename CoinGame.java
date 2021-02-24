
/**Flip 2 coins until one coin gets the same face three times in a row
 *
 * @author Keira Malan
 * @version 23/02/21
 */
public class CoinGame
{
    public static void main(String[] args)
    {
        // set variables
        int c1Heads = 0;
        int c2Heads = 0;
        int c1Tails = 0;
        int c2Tails = 0;
        
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        
        final int COIN_LIMIT = 3;
        // while loop - run both coins until one of them is 3 heads/tails
        while ((c1Heads != COIN_LIMIT) && (c2Heads != COIN_LIMIT) && (c1Tails != COIN_LIMIT) && (c2Tails != COIN_LIMIT)) {
            // flip coin 1
            coin1.flip();
            // if its tails add to tails counter, and with heads
            if (coin1.isHeads()) {
            c1Heads++;
            c1Tails = 0; }
            
            else {
            c1Tails++;
            c1Heads = 0;
        }
            // flip coin 2
            coin2.flip();
            // same thing
            if (coin2.isHeads()) {
            c2Heads++;
            c2Tails = 0;
        }
            else {
            c2Tails++;
        }
            // if either of them reach 3 end the loop
        }
        
        // if both win print draw
        if ((c1Tails == COIN_LIMIT) || (c1Heads == COIN_LIMIT) && (c2Tails == COIN_LIMIT) || (c2Heads == COIN_LIMIT)) {
            System.out.println("It's a draw!");
        }
        
        //  if coin 1 wins print it
        else if ((c1Tails == COIN_LIMIT) || (c1Heads == COIN_LIMIT)) {
            System.out.println("Coin 1 won!");
        }
        // if coin 2 wins print it
        else {
            System.out.println("Coin 2 won!");
        }
        
            
    }
}
