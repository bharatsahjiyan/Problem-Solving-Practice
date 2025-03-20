package LeetCode150;

public class FrequencyOfCharacter2 {
	public static void main(String args[]) {
		String str = "aaabbbbbcccccdddddddd";
		
		for(int i =0; i < str.length(); i++) {
			int count = 1;
			
			for (int j = i+1;j <str.length(); j++ ) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				if(str.charAt(i)!=str.charAt(j) || j==str.length()-1){
					System.out.print(str.charAt(i) + "" + count);
					i = j-1;
					break;
				}
			}
		}
	}

}
