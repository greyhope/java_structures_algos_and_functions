package org.greyhope.sorts;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(1000000);
		}

		System.out.println("Before:");
		printArray(numbers);

		mergeSort(numbers);

		System.out.println("\nAfter:");
		printArray(numbers);

	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	private static void mergeSort(int[] inputArray) {
		int arrayLength = inputArray.length;
		
		// reached the end of the splitting arrays 
		if(arrayLength < 2) {
			return;
		}
		
		// split the array into two
		// find the mid point 
		
		int midPoint = arrayLength / 2;
		
		// make arrays to hold the divided arrays 
		int[] leftArray = new int[midPoint];
		int[] rightArray = new int[arrayLength - midPoint];
		
		// populate the left side of the array 
		for(int i=0;i<midPoint;i++) {
			// counters 
			leftArray[i] = inputArray[i];
		}
		// populate the right side of array 
		// counter must start from midIndex to end of the array length
		for(int i = midPoint;i < arrayLength;i++) {
			// the start of the population must start with first index - not i 
			// and then index of the actual array must start from midIndex 
			rightArray[i - midPoint] = inputArray[i];
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(inputArray,leftArray, rightArray);
		
	}
	
	private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
		
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		
		int m=0,l=0,r=0;
		
		// loop until there are no elements left in either left or right array
		while(l < leftSize && r < rightSize) {
			// find the smaller of the two elements of the array 
			// add the smaller of the two to the result array 
			if(leftArray[l] <= rightArray[r]) {
				inputArray[m] = leftArray[l];
				l++;
			}else {
				inputArray[m] = rightArray[r];
				r++;
			}
			m++;
		}
		
		// there could be elements in either left of right array
		// need the last few elements in either left or right 
		// add the possible remaining elements in the left array 
		while(l < leftSize) {
			inputArray[m] = leftArray[l];
			l++;
			m++;
		}
		
		// add the possible left over of the right array to the result array 
		while(r < rightSize) {
			inputArray[m] = rightArray[r];
			r++;
			m++;
		}
	}
}
