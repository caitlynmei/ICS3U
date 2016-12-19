package com.bayviewglen.daythree;

public class APExamExampleOne {

	//class called sound
	
	private int[] samples;
	
	public int limitAmplitude(int limit) {
		int numChanged = 0;
		for (int i=0; i<samples.length; i++){
			if (samples[i] > limit){
				samples[i] = limit;
				numChanged++;
			} else if (samples[i] < -limit){ //limit * -1
				samples[i] = -limit;
				numChanged++;
			}
		}
		
		return numChanged;
	}
	
	// ---- 1B ----
	public void trimSilenceFromBeginning(){
		int numRemoved = 0;
		
		while (samples[numRemoved] == 0){
			numRemoved++;
		}
		
		int[] newArray = new int[samples.length];
		
		//copy stuff from samples to newArray
		for (int i=0; i<newArray.length; i++){
			newArray[i] = samples[i + numRemoved];
		}
		
		samples = newArray;
		
	}
	
}
