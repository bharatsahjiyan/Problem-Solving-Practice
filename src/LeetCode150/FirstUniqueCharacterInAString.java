package LeetCode150;

public class FirstUniqueCharacterInAString {
	
	
	public static int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++  ){
        	String ch = s.substring(i, i+1);

            if(!(s.replaceFirst(ch, "").contains(ch))){
                return i;
            }

        }
        

        return -1;
    }
	
	public static void main(String args[]) {
		String str = "lle";
		System.out.println(firstUniqChar(str));
	}

}
