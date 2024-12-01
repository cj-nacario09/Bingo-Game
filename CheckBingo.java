import java.util.Random;
import java.util.Scanner;

public class CheckBingo extends Patterns {

    private boolean[] drawnNumbers = new boolean[75]; // draw numbers is from 1 - 75
    private Random random = new Random();

    // simulate marking numbers on the card
    public boolean markdrawlots(int[][] card) {

        CardTemp template = new CardTemp();
        try(Scanner scan = new Scanner(System.in)){

        while (true) {

            System.out.println("\nPress Enter to draw the next number or type 'Q' to quit...");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("Q")){

                System.out.println("Exiting the game. Goodbye!");
                return false;

            }

            int number = drawRandomNumber();

            // mark the number on the card
            markCard(card, number);

            // show the updated card
            System.out.println("\nNumber Drawn: " + number);
            
            template.printBingoCard(card);

            // check if all pattern has a bingo
            if (checkHorizontal(card) || checkVertical(card) || checkDiagonal(card)) {

                System.out.println("Bingoo!!!\n");
                System.out.println("You WoN!\n\n");
                return true;
            }
        }//while

    }//markdraw
    }  // scanner 

    // draw a random number between 1 and 75 (standard Bingo range)
    private int drawRandomNumber(){
        
        int number;

        do {

            // generate a random number between 1 and 75
            number = random.nextInt(75) + 1; 

        } while (drawnNumbers[number - 1]); // check if the number has already been drawn

        // mark the number as drawn
        drawnNumbers[number - 1] = true; 
        return number;
    }

    // mark the drawn number on the card 
    private void markCard(int[][] card, int number) {
        int col = (number - 1) / 15; // determine the column based on the number range

        for (int row = 0; row < 5; row++){
            if (card[row][col] == number){

                // mark the cell and set to 0 if the number matches
                card[row][col] = -1; //-1
                break;

            }
        }
    }// mark card

}//check bingo
