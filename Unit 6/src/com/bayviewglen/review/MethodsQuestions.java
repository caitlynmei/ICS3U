package com.bayviewglen.review;

import java.util.Arrays;

public class MethodsQuestions {

	public static void main(String[] args) {

	}

	public int removeOne(int[] data, int manyItems, int index) {
		
		if ((index < 0) || (index >= manyItems)){
			return -1;
		} if (manyItems > data.length){
			return -1;
		} 
	
		data[index] = data[manyItems-1];
		manyItems--;
		
		return manyItems;
		
	}
	
	public int insertTwo(int[] data, int manyItems, int value){
		
		if (manyItems >= data.length){
			return -1;
		}
		
		data[manyItems] = value; 
		manyItems++;
		
		return manyItems;
		
		
	}
	
	public int removeThree(int[] data, int manyItems, int index){
		
		if ((index < 0) || (index >= manyItems)){
			return -1;
		} if (manyItems > data.length){
			return -1;
		}
		
		for (int i=index; i<manyItems-1; i++){
			data[i] = data[i+1];
		}
		
		manyItems--;
		return manyItems;
		
	}
	
	public int insertFour(int[] data, int manyItems, int value, int index){
		
		if ((index < 0) || (index >= manyItems)){
			return -1;
		} if (manyItems >= data.length){
			return -1;
		} 
		
		for (int i=manyItems; i>index; i--){
			data[i] = data[i-1];
		}
		
		data[index] = value;
		
		return manyItems;
		
	}
	
	

}
