package LeetCode150;

import java.util.Arrays;

public class MergeSortedArray {

	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
         int index = nums1.length-1;
     for(int i=0;i<n;i++){
         nums1[index]= nums2[i];
         index--;
     }
     Arrays.sort(nums1);
     int i = 0;
     while(i<nums1.length) {
    	 System.out.print(nums1[i] + ",");
    	 i++;
     }
 }
	 
	 public static void main(String arsg[]) {
		 int nums1[] = {1,2,3,0,0,0};
		 int nums2[] = {2,5,6};
		 int m = 3;
		 int n = 3;
		  merge(nums1, m, nums2, n );
	 }
}
