package LeetCode150;

public class PalindromeString {
	
	private static boolean checkPalindrome(String str) {
		int i =0;
		int j= str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String args[]) {
		String str  = "madam";
		if(checkPalindrome(str)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}

}
