package com.bayviewglen.sixteen;

import java.util.ArrayList;
import java.util.List;

public class RandomStringChooser {

	private ArrayList<String> words;
	
	public RandomStringChooser(String[] x) {
		words = new ArrayList<String>();
		for (String i : x){
			words.add(i);
		}
	}
	
	public String getNext(){
		if (words.size() == 0){
			return "NONE";
		} else {
			int index = (int)Math.random() * words.size();
			return words.remove(index);
			
			/*String s = words.get(index);
			words.remove(index);
			return s; */
		}
		
	}
	
}
