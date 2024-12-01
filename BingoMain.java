import java.util.Random;

public class BingoMain{
	public static void main(String[] args) {
	    
		int[][] card = BingoCard();
		
		CardTemp cardtemplate = new CardTemp();
		cardtemplate.printBingoCard(card);
		
		CheckBingo CheckPattern = new CheckBingo();
        CheckPattern.markdrawlots(card);
	}

    public static int[][] BingoCard(){

        int[][] card = new int[5][5];
        Random random = new Random();

        // range of the column for bingo card
        int[] colnums = {1, 16, 31, 46, 61};

        for (int col = 0; col < 5; col++){

            // boolean array to mark used numbers in the range for the column
            boolean[] used = new boolean[15];

            for (int row = 0; row < 5; row++){

                // Center cell
                if (col == 2 && row == 2){

                   card[row][col] = 0;
                   continue;
                }

                int number;
                    
                // generate a number in the col range
                do {

                    number = random.nextInt(15);
                    
                } while (used[number]); // check if the number is already used

                used[number] = true; // mark the number as used
                card[row][col] = colnums[col] + number; // map to actual Bingo number
            }
        }

        return card;

    }//bingo Card

}// end of bingo main
