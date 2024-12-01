public final class CardTemp {

	public void printBingoCard(int[][] card){

		System.out.println("\n");
		System.out.println("--------------------------------");
		System.out.println(" B   |  I   |  N   |  G   |  O  ");
		System.out.println("--------------------------------");

		for (int[] row : card){

			for (int col = 0; col < row.length; col++){

				if (col > 0){

					System.out.print("| ");
				} 

				if (row[col] == -1){
					System.out.print(" X   ");;
				}

				else if (row[col] == 0){

					System.out.print("Free ");
				}

				else {

					System.out.printf("%2d   ", row[col]);
				}
				
			}
			

			System.out.println();
			System.out.println("--------------------------------");
		}

	}// show bingo card

}// cardtemp main