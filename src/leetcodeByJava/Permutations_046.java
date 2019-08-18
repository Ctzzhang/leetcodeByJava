/**
 * tzzhang
 * 下午10:16:05
 */
package leetcodeByJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Permutations_046 {

	
	/*Runtime: 1 ms, faster than 98.05% of Java online submissions for Permutations.
	Memory Usage: 37.5 MB, less than 95.74% of Java online submissions for Permutations.*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{};
		List<List<Integer>> retList = permute(a);
		for (List<Integer> list : retList) {
			
			System.out.println(list);
		}
	}
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> retList= new ArrayList<List<Integer>>();
		if (nums.length == 0) {
			return retList;
		}
		
		for (int num : nums) {
			retList = getList(retList, num);
		}
		return retList;
		
    }
	/**
	 * @param retList
	 * @param num
	 */
	private static List<List<Integer>> getList(List<List<Integer>> retList, int num) {
		if (retList.size() == 0) {
			List<Integer> list = new ArrayList<>();
			list.add(num);
			retList.add(list);
			return retList; 
		}
		
		List<List<Integer>> reList = new  ArrayList<List<Integer>>();
		for (List<Integer> list : retList) {
			for (int pos = 0; pos <= list.size(); pos++) {
              List<Integer> l = new ArrayList<>(list);
              l.add(pos, num);
              reList.add(l);
            }
		}
		return reList;
		
	}
}
