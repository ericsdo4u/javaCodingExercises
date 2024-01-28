import java.util.Scanner;

public class PeriodicTable {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your previous period first date bleed: ");
                    int userInput = input.nextInt();

                    //int[] storeUserInputInArray = new int[userInput];

                    int date = calculatingNextPeriod(userInput);


                    System.out.println("your next period date is expected to be: " + (date));

        
    }

    public static int calculatingNextPeriod(int lastDate ) {

        int add = 1;

        for(int count = 1; count <= lastDate; count++) {

            if (count == lastDate) {

                    add += count + 28;
                    break;

            }
        }
        return add;
    }


}

