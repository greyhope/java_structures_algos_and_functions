package org.greyhope.functions;

import java.text.MessageFormat;

public class IsDivisibleBy {
	
	public static void main(String[] args) {
		int divisor = 7;
		int n = 40;
		System.out.println(MessageFormat.format("is {0} divisible by {1} : {2}",n, divisor,isDivisibleBy(divisor, n)));
	}
	
	private static final boolean isDivisibleBy(int divisor, int number) {
		if(number%7 == 0) 
			return true;
		return false;
	}

}
