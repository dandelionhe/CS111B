
import java.util.Random;

public class RPS{
  private int cWins,uWins,ties;
  private enum Moves{ROCK,PAPER,SCISSORS};
  private Moves userMoves,compMoves;

public RPS(){
  this.cWins=0;
  this.uWins=0;
  this.ties=0;
}

// getters for the results
  public int getCWins(){ return this.cWins;}
  public int getUWins(){ return this.uWins;}
  public int getTies(){  return this.ties;}
  public Moves getMoves(){return this.userMoves;}

  // get user moves from GUI, and pass into the game
public void setUMoves(int num){
  switch(num){
    case 0:
      this.userMoves=Moves.ROCK;
      break;
    case 1:
      this.userMoves=Moves.PAPER;
      break;
    case 2:
      this.userMoves=Moves.SCISSORS;
      break;
  }
}
  public int generateComputerPlay(){
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
    return rantNum;
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
