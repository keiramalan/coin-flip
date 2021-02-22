/**
 * Making a Coin object
 *
 * @author Luna Wilkes
 * @version 19/02/2021
 */
public class Coin
{
    private final int HEADS = 0; // tails is 1
    private int face;   // current side showing
   
    /**
     * Setup this coin by flipping it initially
     */
   
    public Coin() {
        flip();
    }
   
    /**
     * Flips the coin by randomly choosing a face value
     */
   
    public void flip() {
        face = (int) (Math.random() * 2);
    }
   
    /**
     * @return boolean Return true if the current face of the coin is heads
     */
   
    public boolean isHeads() {
        return (face == HEADS);
    }
   
    /**
     * @return String Returns the current face of this coin as a string
     */
   
    public String toString() {
        return (face == HEADS) ? "Heads" : "Tails";
    }
}

