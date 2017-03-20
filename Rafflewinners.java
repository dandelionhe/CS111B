/**
 * Created by yongzhenghe on 1/23/17.
 */

import java.util.Scanner;
import java.util.Random;

public class Rafflewinners {

    public static int getInput(){
    Scanner in = new Scanner(System.in);
    while (!in.hasNextInt()){
        String word = in.nextLine();
        System.out.println(word + "is not a number, Please enter a number!");
    }
    int num = in.nextInt();
    while(num<1){
        System.out.println("Make sure your number is greater than 0.");
        num =in.nextInt();
    }
    return num;
    }

    public static int getRandomNumber(int n, int m){
        Random rand = new Random();
        int randnum = rand.nextInt((m-n)+1) + n;
        return randnum;
    }

    public static boolean checkstatus(){
        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to raffle again?");
        String reply = in.nextLine();
        if(reply.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int winner,smallest,largest;
        int[] winners;
        boolean check;
        do{
            System.out.println("How many winners do you want ?");
            winner = getInput();
            System.out.println("Please enter the smallest number.");
            smallest = getInput();
            System.out.println("Please enter the largest number.");
            largest = getInput();
            // Make sure enough slot for the winners
            while (smallest > largest || largest - smallest < winner-1) {
                System.out.println("Make sure the largest number is greater than the smallest or enough space for the winners. ");
                largest = getInput();
            }

//            generate the winners
            winners = new int[winner];
            for(int i=0;i<winner;i++){
                int randnum = getRandomNumber(smallest,largest);
                for(int num:winners){
                    while(randnum == num){
                        randnum = getRandomNumber(smallest,largest);
                    }
                }
                winners[i] = randnum;
            }

//            Print out the winners
            for(int num:winners){
                System.out.println("The winner is " + num);
            }
//            check play again or not
            check = checkstatus();

        }while (check == true);
    }
}
