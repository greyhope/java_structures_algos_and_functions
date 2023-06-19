package org.greyhope.functions;

public class ShortestDistanceBetweenWords {
	
	public static void main(String[] args) {
	String[] S = { "the", "quick", "brown", "fox"};
    String word1 = "the", word2 = "quick";
    System.out.println(shortestDistance(S, word1, word2));
	}

	private static int shortestDistance(String[] s, String word1, String word2) {
		
		int w1 = -1, w2 = -1;
		int distance = Integer.MAX_VALUE;
		
		for(int wc = 0; wc < s.length ;wc++) {
			if(s[wc] == word1) {
				w1 = wc;
			}
			
			if(s[wc] == word2) {
				w2 = wc;
			}
			
			if(w1 != -1 && w2 != -1) {
				distance = Math.min(distance, Math.abs(w1 - w2));
			}
			
		}
		return distance;
	}

}
