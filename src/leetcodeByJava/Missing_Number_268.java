/**
 * tzzhang
 * 下午11:08:32
 */
package leetcodeByJava;

import java.util.Arrays;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月5日
 */
public class Missing_Number_268 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{1,2,5,0,6,7,9,3,4};
		
		
		  System.out.println(missingNumber(a)); 
	}
	public static int missingNumber(int[] nums) {
		qsort(nums,  0,  nums.length-1);
		System.out.println(Arrays.toString(nums));
		
		if (nums.length <= 1) {
			if (nums[0] == 0 ) {
				return 1;
			}
		}
		if (nums[0] >= 1) {
			return 0;
		}
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] -nums[i-1] > 1) {
				return i;
			}
		}
		return nums.length;
    }
	
	public static void qsort(int[] nums, int low, int high) {
		if (low < high) {
			int  pos = qs(nums, low, high);
			qsort(nums, low, pos - 1);
			qsort(nums, pos + 1, high);
		}
	}
	/**
	 * @param nums
	 * @param low
	 * @param high
	 * @return
	 */
	private static int qs(int[] nums, int low, int high) {
		int left = low;
		int right = high;
		int key = nums[low];
		while (left < right) {
			while(left < right && key < nums[right]) {
				right --;
			}
			nums[left] = nums[right];	
			while(left < right && key >= nums[left]) {
				left ++;
			}	
			nums[right] = nums[left];
		}
		nums[left] = key;
		
		return left;
	} 
	
}
