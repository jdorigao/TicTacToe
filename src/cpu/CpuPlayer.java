package cpu;

public class CpuPlayer {
	
	private static int boardCpu[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	private static int played[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	private static int max = 9;
	private static int randCpu;
	
	private static int playedCpu() {
		max -= 2;
		int cont = 0;
		int position = 0;
		
		for (int i=0; i<9; i++) {
			if(boardCpu[i] == 0) {
				played[position] = cont;
				position++;
			}
			cont++;
		}
		
		randCpu = (int) (Math.random() * max);
		
		checkMove(1);
		
		checkMove(2);
		
		return randCpu;
	}
	
	private static void checkMove(int id) {
		
		if (boardCpu[0] == 0) {
	        if (boardCpu[1] == id && boardCpu[2] == id)
	            randCpu = 0;
	        if (boardCpu[4] == id && boardCpu[8] == id)
	            randCpu = 0;
	        if (boardCpu[3] == id && boardCpu[6] == id)
	            randCpu = 0;
	    }

	    if (boardCpu[1] == 0) {
	        if (boardCpu[0] == id && boardCpu[2] == id)
	            randCpu = 1;
	        if (boardCpu[4] == id && boardCpu[7] == id)
	            randCpu = 1;
	    }

	    if (boardCpu[2] == 0) {
	        if (boardCpu[0] == id && boardCpu[1] == id)
	            randCpu = 2;
	        if (boardCpu[4] == id && boardCpu[6] == id)
	            randCpu = 2;
	        if (boardCpu[5] == id && boardCpu[8] == id)
	            randCpu = 2;
	    }

	    if (boardCpu[3] == 0) {
	        if (boardCpu[0] == id && boardCpu[6] == id)
	            randCpu = 3;
	        if (boardCpu[4] == id && boardCpu[5] == id)
	            randCpu = 3;
	    }

	    if (boardCpu[4] == 0) {
	        if (boardCpu[0] == id && boardCpu[8] == id)
	            randCpu = 4;
	        if (boardCpu[2] == id && boardCpu[6] == id)
	            randCpu = 4;
	        if (boardCpu[1] == id && boardCpu[7] == id)
	            randCpu = 4;
	        if (boardCpu[3] == id && boardCpu[5] == id)
	            randCpu = 4;
	    }

	    if (boardCpu[5] == 0) {
	        if (boardCpu[3] == id && boardCpu[4] == id)
	            randCpu = 5;
	        if (boardCpu[2] == id && boardCpu[8] == id)
	            randCpu = 5;
	    }

	    if (boardCpu[6] == 0) {
	        if (boardCpu[0] == id && boardCpu[3] == id)
	            randCpu = 6;
	        if (boardCpu[4] == id && boardCpu[2] == id)
	            randCpu = 6;
	        if (boardCpu[7] == id && boardCpu[8] == id)
	            randCpu = 6;
	    }

	    if (boardCpu[7] == 0) {
	        if (boardCpu[1] == id && boardCpu[4] == id)
	            randCpu = 7;
	        if (boardCpu[6] == id && boardCpu[8] == id)
	            randCpu = 7;
	    }

	    if (boardCpu[8] == 0) {
	        if (boardCpu[0] == id && boardCpu[4] == id)
	            randCpu = 8;
	        if (boardCpu[2] == id && boardCpu[5] == id)
	            randCpu = 8;
	        if (boardCpu[6] == id && boardCpu[7] == id)
	            randCpu = 8;
	    }
	}
	
	public static int setPlayed(int[] board) {		
		boardCpu = board;		
		return playedCpu();
	}
	
	public static void startCpu() {
		for (int i=0; i < played.length; i++) 
			played[i] = 0;
		
		max = 9;
	}
}
