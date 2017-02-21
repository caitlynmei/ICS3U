


import java.util.Scanner;

public class MagicSquares {

	public static void main(String[] args) {
		
		String answer = "magic";
		
		int[][] arr = new int[4][4];
		
		Scanner keyboard = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[0].length; j++){
				arr[i][j] = keyboard.nextInt();
			}
		}
		
		/*
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
		*/
		
		boolean check = true;
		
		int sumRowMain = 0;
		
		for (int row=0; row<arr.length; row++){
			int sumRowCurrent = 0;
			for (int column=0; column<arr[0].length; column++){
				sumRowCurrent += arr[row][column];
			}
			if (row == 0){
				sumRowMain = sumRowCurrent;
			} else {
				if (sumRowCurrent != sumRowMain)
					check = false;
			}
		}
		
		for (int column=0; column < 4; column++){
			int sumColumnCurrent = 0;
			for (int row=0; row<arr.length; row++){
				sumColumnCurrent += arr[row][column];
			}
			if (sumColumnCurrent != sumRowMain){
				check = false;
			}
		}
			
		if (check == false){
			answer = "not magic";
		}
		
		System.out.println(answer);
		
	}

}
