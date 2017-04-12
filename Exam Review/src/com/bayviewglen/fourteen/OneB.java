package com.bayviewglen.fourteen;

import java.util.ArrayList;
import java.util.List;

public class OneB {

	public static void main(String[] args) {
		
		System.out.println("This is the scrambled word: " + scrambleWord("TAN"));
		
	}
	
	public static String scrambleWord(String word){
		String[] newWord = new String[word.length()];
		
		for (int i=0; i<word.length(); i++){
			newWord[i] = word.substring(i, i+1);
		}
				
		for (int i=0; i<word.length()-1; i++){
			String temp = newWord[i];
			
			if (temp.equals("A")){
				newWord[i] = newWord[i+1];
				newWord[i+1] = temp;
				i++;
			}
		}
		
		String scrambledWord = "";
		for (int i=0; i<word.length(); i++){
			scrambledWord += newWord[i];
		}
		
		return scrambledWord;
	}
	
	public static void scrambleOrRemove(List<String> wordList){
		List<String> newList = new ArrayList<String>();
		
		String temp = "";
		
		for (int i=0; i<wordList.size(); i++){
			temp = scrambleWord(wordList.get(i));
			newList.add(temp);
			
			if (temp.equals(wordList.get(i))){
				newList.remove(temp);
			}
		}
		
		wordList = newList;
	}
}
