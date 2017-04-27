
import java.util.*;

public class ex{
  private static RPS game;

  public static void main(String[] args) {
    game=new RPS();
    game.setUMoves(0);
    game.generateComputerPlay();
    game.findWinner();
    String summary=Integer.toString(game.getCWins())+Integer.toString(game.getUWins())+Integer.toString(game.getTies());

    System.out.println(summary);

  }
}
