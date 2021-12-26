import java.util.*;

public class SnakeandLadder {
    System.out.println("Welcome to Snake and Ladder game");
    public static void main(String[] args) {
        numberOfPlayers();
    }

    //    function to initialize the number of players
    static void numberOfPlayers(){
//        setting the player's start position to 0
        int playerOnePosition = 0;
        playGame(playerOnePosition);
    }