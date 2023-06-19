package org.greyhope.functions;

import java.text.MessageFormat;
import java.util.Arrays;

public class ReverseOrderIntArray {
	
	public static void main(String[] args) {
		
		int[] input = {23453,3432,443,43243,3452,6,43345};
		
		Arrays.sort(input);
		
		System.out.println(Arrays.toString(input));
		
		reverse(input);
		
		System.out.println(Arrays.toString(input));
		
	}
	
	private static void reverse(int[] array) {
		int size = array.length;
		
		for(int i = 0 ;i < size / 2;i++) {
			int temp = array[i];
			System.out.println(MessageFormat.format("loop index {0} array value at mentioned index {1} array value at size - index -1 : {2} index of size - i - 1 {3}", i,temp,array[size - i - 1],size - i -1));
			// set the begining index elements to the tail element values 
			array[i] = array[size - i - 1];
			// set the end of the array with values in temp from the begining 
			array[size - i -1] = temp;
		}
		
	}

}
