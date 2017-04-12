package com.bayviewglen.fifteen;

public class two {

	public static void main(String[] args) {


		

	}
	
	public class HiddenWord{
		
		private String theWord;
		
		//HiddenWord puzzle = new HiddenWord("HARPS");
		
		public HiddenWord(String x){
			theWord = x;
		}
		
		public String getHint(String guess){
			String temp = "";
			
			for (int i=0; i<guess.length(); i++){
				char x = guess.charAt(i);
				
				if (theWord.charAt(i) == x){
					temp += x; 
				} else if (theWord.indexOf(x) >= 0){
					temp += "+";
				} else {
					temp += "*";
				}
				
			}
			return temp;
		}
		
	}

}
