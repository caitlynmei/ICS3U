package com.bayviewglen.dayfour;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class ExampleTwo {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>(); 	// ArrayList is more specific
		words = new LinkedList<String>();
		
		words.add("hi");
		words.add("bye");
		
		try {
			FileWriter fw = new FileWriter(new File("data/output.dat"));
		 
			for (String s : words){
				fw.write(s + "\n"); // write to data file
			}
			fw.close();		
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
		System.out.println(words);
		
		for (String s : words){
			System.out.println(s);
		}
		
		
		
	}

}
