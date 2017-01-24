import java.util.Scanner;
import java.util.Random;

public class Rafflewinners {
    public static int getInput(){
        Scanner in = new Scanner(System.in);
        while(!in.hasNextInt()){
            String word = in.nextLine();
            System.out.println(word + " is not a valid number.");
        }
        int num = in.nextInt();
        while(num < 1){
            System.out.println("Make sure the number is greater than 0.");
            num = in.nextInt();
        }
        return num;
    }

    public static int getRandomNumber(int m,int n){
        Random rand = new Random();
        int randnumber = rand.nextInt((n-m)+1) + m;
        return randnumber;
    }

    public static boolean getStatus(){
        Scanner in = new Scanner(System.in);
        System.out.println("Would you want to run the raffle again?(y/n)");
        String reply = in.nextLine();
        if(reply.equals("y")){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        int numOfWinners,randnum, smallest, largest;
        int[] winningNumbers ;
        boolean check;

        do{
            System.out.println("Please enter the number of winners of the raffle:");
            numOfWinners = getInput();
            winningNumbers = new int[numOfWinners];
            System.out.println("Please enter the smallest raffle number you want to sell:");
            smallest = getInput();
            System.out.println("Please enter the largest raffle number you want to sell:");
            largest = getInput();

//            generate the random number and put them into the array
            for(int i=0;i< numOfWinners;i++){
                randnum = getRandomNumber(smallest,largest);
//                make sure no duplicate number in winning numbers.
                for(int num:winningNumbers){
                    while(num == randnum){
                        randnum = getRandomNumber(smallest,largest);
                    }
                }

                winningNumbers[i] = randnum;
            }

//          print out the winning number
            for(int num: winningNumbers){
                System.out.printf("The winning number is: %5d\n",num);
            }

//            run again or exit
            check = getStatus();

        }while(check == true);


    }
}
