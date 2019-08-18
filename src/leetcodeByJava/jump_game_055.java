/**
 * tzzhang
 * 下午10:53:22
 */
package leetcodeByJava;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class jump_game_055 {
	   public boolean canJump(int[] nums) {
	        int f = nums[0];
	        int len = 0;
	        for (int i = 1; i<=f; i++) {
	        	len = len + i;
	        	getlen(nums, i, len); 
	        }
			return false;
	    }

	/**
	 * @param nums 
	 * @param i
	 * @param len
	 */
	private void getlen(int[] nums, int j, int len) {
		int a = nums[len];
		for (int i = 1; i<=a; i++) {
			
		}
		
	}
	
	
	
}
