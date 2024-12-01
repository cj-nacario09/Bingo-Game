public abstract class Patterns {

    // for horizontal pattern
    public boolean checkHorizontal(int[][] card) {

        for (int[] row : card) {

            boolean bingo = true;

            for (int num : row) {

                if (num != 0 && num != -1) { // assume marked cells are 0 center cell and marked
                    bingo = false;
                    break;
                }
            }

            if (bingo){
                
                // bingo
                System.out.println("\nHorizontal Pattern!\n");
                return true;
            }
        }

        return false;

    }// horinzontal

    // for a vertical pattern
    public boolean checkVertical(int[][] card) {

        for (int col = 0; col < 5; col++) {

            boolean bingo = true;

            for (int row = 0; row < 5; row++) {

                if (card[row][col] != 0 && card[row][col] != -1 ) { 

                    bingo = false;
                    break;
                }
            }

            if (bingo) {

                System.out.println("\nVertical Pattern!\n");
                return true;
            }
        }

        return false;

    }//verticak

    //for diagonal pattern 
    public boolean checkDiagonal(int[][] card) {

        boolean diagonal1 = true; // top left to bottom right
        boolean diagonal2 = true; // top right to bottom left

        for (int i = 0; i < 5; i++){

            // check top left to bottom right
            if (card[i][i] != 0 && card[i][i] != -1) { 


                diagonal1 = false;

            }
                            
            // check top right to bottom left
            if (card[i][4 - i] != 0 && card[i][4 - i] != -1){ 

                diagonal2 = false;
            }
        }

        if (diagonal1 || diagonal2){

            System.out.println("\nDiagonal Pattern!\n");
            return true;
            
        }

        return false;

    }//diagoal

}// patterns
