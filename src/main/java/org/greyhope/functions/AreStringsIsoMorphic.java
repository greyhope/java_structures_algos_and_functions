package org.greyhope.functions;

import java.util.Arrays;

public class AreStringsIsoMorphic {
	
	static int size = 256;
	
	public static void main(String[] args) {
		boolean res = areIsomorphic("aaab11", "aaaybb");
        System.out.println(res);
	}

	private static boolean areIsomorphic(String s1, String s2) {
		
		int s1L = s1.length();
		int s2L = s2.length();
		
		if(s1L != s2L) {
			return false;
		}
		
		Boolean[] marked = new Boolean[size];
		Arrays.fill(marked, false);
		int[] map = new int[size];
		Arrays.fill(map, -1);
		
		for(int i = 0;i < s1L;i++) {
			System.out.println(s1.charAt(i));
			if(map[s1.charAt(i)] == -1) {
				System.out.println("map element empty for " + (int)s1.charAt(i));
				if(marked[s2.charAt(i)] == true) {
					return false;
				}
				
				marked[s2.charAt(i)] = true;
				// System.out.println("s2 char " + map[s2.charAt(i)]);
				map[s1.charAt(i)] = s2.charAt(i);
				
			}else if(map[s1.charAt(i)] != s2.charAt(i)){
				return false;
			}
			// System.out.println("s1 " + map[s1.charAt(i)]);
			//System.out.println("s1 char " + map[s1.charAt(i)]);
			//System.out.println("s2 char " + map[s2.charAt(i)]);
		}
		System.out.println(Arrays.toString(map));
		
		return true;
	}

}
