
import java.util.Random;

public class RPS{
  public int cWins=0,uWins=0,ties=0;
  public enum Moves{ROCK,PAPER,SCISSORS};
  private enum Outcomes{COMPUTERWINS,USERWINS,TIES};
  private Moves userMoves,compMoves;

public RPS(){
  
}

// getters for the results
  public int getCWins(){return this.cWins;}
  public int getUWins(){ return this.uWins;}
  public int getTies(){ return this.ties;}

  // get user moves from GUI, and pass into the game
public void setUMoves(int num){
  switch(num){
    case 0:
      this.compMoves=Moves.ROCK;
      break;
    case 1:
      this.compMoves=Moves.PAPER;
      break;
    case 2:
      this.compMoves=Moves.SCISSORS;
      break;
  }
}
  public void generateComputerPlay(){
    Random rant=new Random();
    int rantNum=rant.nextInt(3);
    switch(rantNum){
      case 0:
        this.compMoves=Moves.ROCK;
        break;
      case 1:
        this.compMoves=Moves.PAPER;
        break;
      case 2:
        this.compMoves=Moves.SCISSORS;
        break;
    }
  }

  public void findWinner(){
    switch(this.userMoves){
      case ROCK:
        if(this.compMoves==Moves.ROCK)
          this.ties+=1;
        else if(this.compMoves==Moves.PAPER)
          this.cWins+=1;
        else if(this.compMoves==Moves.SCISSORS)
          this.uWins+=1;
        break;
      case PAPER:
        if(this.compMoves==Moves.ROCK)
          this.uWins+=1;
        else if(this.compMoves==Moves.PAPER)
          this.ties+=1;
        else if(this.compMoves==Moves.SCISSORS)
          this.cWins+=1;
        break;
      case SCISSORS:
        if(this.compMoves==Moves.ROCK)
          this.cWins+=1;
        else if(this.compMoves==Moves.PAPER)
          this.uWins+=1;
        else if(this.compMoves==Moves.SCISSORS)
          this.ties+=1;
        break;
    }
  }

}
