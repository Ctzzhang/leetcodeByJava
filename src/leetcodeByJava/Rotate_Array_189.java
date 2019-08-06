/**
 * tzzhang
 * 下午10:35:09
 */
package leetcodeByJava;

import java.util.Arrays;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Rotate_Array_189 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{-1,-100,3,99};
		rotate(a, 2);
		
		System.out.println(Arrays.toString(a)); 

	}
	public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
        	doRotate(nums);
        }
    }
	/**
	 * @param nums
	 */
	private static void doRotate(int[] nums) {
		for (int i = nums.length - 1; i > 0; i--) {
			int temp = nums[i];
			nums[i] = nums[i-1];
			nums[i-1] = temp;
		}
	}
	

}
