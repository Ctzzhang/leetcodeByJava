/**
 * tzzhang
 * 下午10:16:05
 */
package leetcodeByJava;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Find_the_Duplicate_Number_287 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{3,1,3,4,2};
		System.out.println(findDuplicate(nums));
		
	}
	public static int findDuplicate(int[] nums) {
		if (nums.length <= 0) {
			return 0;
		}
		
		int slow = nums[0];
        int fast = nums[nums[0]];
        
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
