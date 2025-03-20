package LeetCode150;

import java.util.HashMap;

public class FrequencyOfCharacter {
	public static void main(String args[]) {
		String str = "aaabbbbccccccdd";
		System.out.println(calculateFrequency(str));
	}
	
	
	public static HashMap<Character, Integer> calculateFrequency (String str){
		HashMap<Character, Integer> myMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (myMap.containsKey(ch)) {
			int n= myMap.get(ch) + 1;
				myMap.put(ch,n);
			} else {
				myMap.put(ch, 1);
			}
		}
		return myMap;
	}
}
