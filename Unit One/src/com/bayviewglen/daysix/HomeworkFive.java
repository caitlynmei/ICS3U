package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {
		
		// NY Yankee Score
		
		double lost, total, percentage;
		int win; 
		
		win = 110;
		lost = 44;
		total = win + lost;
		
		percentage = (win / total) * 100;
		
		percentage = (int)(percentage * 1000);
		percentage = (double)(percentage / 1000);
		
		System.out.println("With " + win + " wins and " + (int) lost + " losses out of " + (int) total + " games, the 1927 New York Yankees won " + percentage + "% of their games.");

	}

}
