package LeetCode150;
import java.util.Stack;

public class RotateArray {
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int k = 3;
		nums = rotate(nums, k);
		for (int i=0; i<nums.length;i++) {
			System.out.print(nums[i] + " " );
		}
		
	}
			
	public static int[] rotate(int[] nums, int k) {
		Stack<Integer> stk2 = new Stack<Integer>();
        Stack<Integer> stk1 = new Stack<Integer>();
        for(int i=nums.length-1; i>=0; i--){
           if(k>0){
              stk1.push(nums[i]);
              k--;
           } else {
               stk2.push(nums[i]);
           }
        }
        for(int i = 0; i<nums.length; i++){
           if(!stk1.isEmpty()){
               nums[i] = stk1.pop();
           } else {
              nums[i]= stk2.pop();
           }

        }
		return nums;

       
   }	
		
	}
	



