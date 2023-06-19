package org.greyhope.functions;

import java.text.MessageFormat;

public class MiddlePointBetweenTwoChars {

	public static void main(String[] args) {
		String str = "aabbbaabababbbb";
		char left = 'a';
		char right = 'b';

		System.out.println(MessageFormat.format("find middlepoint for left {0} and right {1} for string {2} is {3}",left, right,str, findIndex(str, left, right)));

	}

	private static int findIndex(String str, char leftC, char rightC) {

		// get a length if inout string
		int len = str.length();
		// create array to hold left values 
		int[] left = new int[len + 1];
		// create a array to hold right values 
		int[] right = new int[len + 1];
		// result index 
		int index = -1;

		// set the begining of left (must start with left at left of array)
		right[0] = 0;
		// set the ending of right (must start with right at right of array)
		left[len] = 0;

		// check the first index of string for left char
		if (str.charAt(0) == leftC) {
			// if the left char has been found at first index of left array 
			// set the left array fiorst element 
			left[1] = 1;
		}
		
		// check the ending of input array for right char  
		if (str.charAt(len - 1) == rightC) {
			right[len - 1] = 1;
		}
		
		for (int i = 1; i < len; i++){
            if ( str.charAt(i) == leftC )
                left[i+1] = left[i] + 1;
            else
            	left[i+1] = left[i];
        }

		for (int i = len-2; i >= 0; i--) {
			if (str.charAt(i) == rightC)
				right[i] = right[i + 1] + 1;
			else
				right[i] = right[i + 1];
		}
		
		if (left[len] == 0)
            return len;
        if (right[0] == 0)
            return 0;
     
        for (int i=0; i<=len; i++)
            if (left[i] == right[i])
                index = i;
      
        return index;
	}
}
