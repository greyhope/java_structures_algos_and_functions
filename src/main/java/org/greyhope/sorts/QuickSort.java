package org.greyhope.sorts;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10000);
		}

		System.out.println("Before:");
		printArray(numbers);

		quicksort(numbers, 0, numbers.length-1);

		System.out.println("\nAfter:");
		printArray(numbers);

	}
	
	private static void quicksort(int[] inputArray, int lowIndex, int highIndex) {
		// set the pivot to the array high index 
		// match to below recursive quicksort method call
		int pivot = inputArray[highIndex];
		
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		// in a recursive call if there is one element left 
		if(lowIndex >= highIndex) {
			return;
		}
		
		
		while(leftPointer < rightPointer) {
			
			while(inputArray[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while(inputArray[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			// swap the index values after matches found 
			swap(inputArray,leftPointer, rightPointer);
		}
		
		// swap the index value with pivot value 
		swap(inputArray, leftPointer, highIndex);
		
		// quicksort the left sub array 
		quicksort(inputArray,lowIndex, leftPointer-1);
		// quicksort the right sub array 
		quicksort(inputArray,leftPointer+1, highIndex);
		
		
	}

	private static void swap(int[] inputArray, int leftPointer, int rightPointer) {
		int temp = inputArray[leftPointer];
		inputArray[leftPointer] = inputArray[rightPointer];
		inputArray[rightPointer] = temp;
	}

	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	
}
