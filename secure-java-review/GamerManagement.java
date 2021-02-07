package codereview;
​
import java.sql.SQLException;
​
public class GameManagement {​
    /**
     * Each player can redeem their credits to buy additional game hours. The cost of these
     * game hours depends on the gamer's level. This method returns the cost of a the 
     * hours redeemed by the gamer.
     *
     * @param playerID id of the player
     * @param numOfCredit number of credits still available to gamer
     * @throws SQLException in case the gamer is not found
     */
    public double redeemCredits(String playerID, int numOfCredits) throws SQLException {
        //TODO
        return 0;
    }
​
    /**
     * Get the level for an gamer, given their gamer ID
     *
     * @param gamerID
     * @return the current level of the specified gamer
     * @throws SQLException in case of gamer not found
     */
    protected int getGamerLevel(String gamerID) throws SQLException {
        //TODO
        return 0;
    }
​
    /**
     * The the hours for the game is based on the gamer's level.
     *
     * @param  numOfCreditsToRedeem  number of credits the gamer wants to redeem
     * @param  gamerLevel current game level the gamer achieved
     * @return the hours that can be redeemed with the credit
     */
    protected double calculateHoursForCredits(int numOfCreditsToRedeem, int gamerLevel) {
        //TODO
        return 0;
    }
​
    /**
     * We calculate how many hours to play a gamer can redeem
     * with a certain amount of credits based on their gamer level 
     *
     * Gamers up to Level 4 get a hour multiplier of 1.5;
     * Gamers Level 4 to Level 6 get a hour multiplier of 1.8;
     * Gamers over Level 6 get a hour multiplier of 2.
     *
     * @param gamerLevel the current level of the gamer
     * @return the multiplier to be applied
     *
     */
    protected double getGameHourMultiplier(int gamerLevel) {
        //TODO
        return 0;
    }
}