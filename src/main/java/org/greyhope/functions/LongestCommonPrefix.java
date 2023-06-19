package org.greyhope.functions;

import java.text.MessageFormat;
import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] input = {"ebeneezer", "ebe", "ebener", "ebetinebeeeer"};
		System.out.println(MessageFormat.format("longest common prefix : {0}",findLongestCommonPrefix(input)));
	}
	
	private static String findLongestCommonPrefix(String[] inputArray) {
		
		if(inputArray.length == 0) {
			return "";
		}
		
		if(inputArray.length == 1) {
			return inputArray[0];
		}
		
		// dual pivot quick sort 
		Arrays.sort(inputArray);
		Arrays.asList(inputArray).stream().forEach(element -> {System.out.println(MessageFormat.format("element : {0}",element));});

		// find the smallest string in the list between the first and last string in the array 
		int end = Math.min(inputArray[0].length(), inputArray[inputArray.length-1].length());
		System.out.println(MessageFormat.format("smallest sized element in input array {0}",end));
		
		int i =0;
		while(i < end && inputArray[0].charAt(i) == inputArray[inputArray.length-1].charAt(i)) {
			System.out.println(MessageFormat.format("index is {0} and first element index char is : {1} and final element index chat at is : {2}",i, inputArray[0].charAt(i),inputArray[inputArray.length-1].charAt(i)));
			i++;
		}
		
		String result = inputArray[0].substring(0, i);
		return result;
	}

}
