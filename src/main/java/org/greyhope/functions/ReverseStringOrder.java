package org.greyhope.functions;

public class ReverseStringOrder{
	
	public static void main(String[] args) {
		char[] stringValue = new String("hello").toCharArray();
		
		System.out.println(stringValue);
		
		//char[] result = reverseAll(stringValue);
		reverseWord(stringValue,0,stringValue.length - 1);
		System.out.println(stringValue);
	}
	
	private static char[] reverseAll(char[] sentence) {
		
		// a full statement/sentence expected 
		
		// going through entire string of chars to find a space 
		// when a space is found then reverse the word 
		// 
		int begin = 0;
		for(int spaceMarker = 0;spaceMarker < sentence.length;spaceMarker++) {
			if(sentence[spaceMarker] == ' ') {
				reverseWordOrder(sentence,begin,spaceMarker-1);
				
				begin = spaceMarker + 1;
			}
		}
		
		reverseWordOrder(sentence,begin,sentence.length-1);
		// reverseWordOrder(sentence, 0, sentence.length - 1);
		System.out.println(sentence);
		
		
		return sentence;
	}
	
	private static void reverseWordOrder(char[] word, int x, int y) {
		char temp;
		// while through the word 
		// mving pointers twords each other (x moving right and y moving left)
		// last moment is when x == y 
		// System.out.println(word);
		while(x <= y) {
			// save the last char 
			// because we are overwriting the last with the first 
			temp = word[x];
			// overwrite y with x 
			word[x] = word[y];
			// overwrite x with temp 
			word[y] = temp;
			// move pointer right 
			x++;
			// move pointer left 
			y--;
		}
	}
	
	private static void reverseWord(char[] array, int begin, int end ) {
		
		char temp;
		
		while(begin <= end) {
			
			temp = array[end];
			array[end] = array[begin];
			array[begin] =  temp;
			begin++;
			end--;
			
		}
		
	}
	
	

}
