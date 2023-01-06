package com.collection;
import java.util.ArrayList;

public abstract class MinToFront {

	public static void main(String[] args) {
//		ArrayList sample[] = {5,9,2,11,52,99};
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(5);
		intList.add(9);
		intList.add(2);
		intList.add(11);
		intList.add(52);
		intList.add(99);
		
		System.out.println("Before calling to minToFront: "+ intList);
				
		minToFront(intList);
		
		System.out.println("After calling to minToFront: "+ intList);
	}

	private static void minToFront(ArrayList<Integer> intList) {
		int temp =0;
		
		for(int i = 0; i < intList.size()-1; i++) {
			if(intList.get(i) > intList.get(i+1)) {
				temp = intList.get(i+1);
			}
			
		}
		
		intList.remove(temp);
		intList.add(0, temp);
		
	}

}