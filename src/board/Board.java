package board;

public class Board {
	
	// [0] Draw, [1] Player 1, [2] Player 2
	private static int score[] = {0, 0, 0};
	private static int board[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};	
			
	private static int checkMove() {		
		int played = 0;

	    // #1 row
	    if ((board[0] == board[1]) && (board[1] == board[2]))
	        played = board[0];

	    // #2 row
	    else if ((board[3] == board[4]) && (board[4] == board[5]))
	        played = board[3];

	    // #3 row
	    else if ((board[6] == board[7]) && (board[7] == board[8])) 
	        played = board[6];

	    // #1 column
	    else if ((board[0] == board[3]) && (board[3] == board[6]))
	        played = board[0];

	    // #2 column
	    else if ((board[1] == board[4]) && (board[4] == board[7]))
	        played = board[1];

	    // #3 column
	    else if ((board[2] == board[5]) && (board[5] == board[8]))
	        played = board[2];

	    // Descending diagonal
	    else if ((board[0] == board[4]) && (board[4] == board[8]))
	        played = board[0];

	    // Ascending diagonal
	    else if ((board[6] == board[4]) && (board[4] == board[2]))
	        played = board[6];

	    else // None of the existing combinations
	    {
	        int empty = 0;

	        for (int i = 0; i < 9; i++)
	            if (board[i] == 0)
	                empty++;
	        
	        if (empty == 0)
	            played = 3; // Draw
	    }

	    // Increase score
	    if (played == 1)
	        score[1]++;

	    if (played == 2)
	        score[2]++;

	    if (played == 3)
	        score[0]++;

	    // If played=0 the game continues
	    return played;
	}
		
	private static void startBoard() {
		for (int i=0; i < board.length; i++) {
			board[i] = 0;
		}
	}
	
	private static void stopBoard() {
		for (int i=0; i < board.length; i++) 
			board[i] = 0;
		
		for (int i=0; i < score.length; i++)
			score[i] = 0;
	}
	
	public static int getScore(int player) {
		return score[player];
	}

	public static int[] getboard() {
		return board;
	}
	
	public static int setPlayed(int player, int played) {
		board[played] = player;
		return checkMove();
	}
	
	public static void setStatusBoard(String status) {
		if (status.equals("start"))
			startBoard();
		
		if (status.equals("stop"))
			stopBoard();
	}
}
