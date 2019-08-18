/**
 * tzzhang
 * 下午10:16:05
 */
package leetcodeByJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Top_K_Frequent_Elements_347 {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((2));
	}
	public List<Integer> topKFrequent(int[] nums, int k) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int num : nums) {
	    	if (map.containsKey(num)) {
	    		int a = map.get(num);
	    		map.put(num, a+1);
	    	} else {
	    		map.put(num, 1);
	    	}
	    }
	    
	    List<Integer>[] bucket = new List[nums.length + 1];
	    for (int key : map.keySet()) {
	    	int fre = map.get(key);
	    	if (bucket[fre] == null) {
	    		bucket[fre] = new ArrayList<>();
	    	}
	    	bucket[fre].add(key);
	    }
	    List<Integer> ret = new ArrayList<>();
        for (int i = nums.length; i >= 0 && ret.size() < k; --i) {
            if (bucket[i] != null) {
                ret.addAll(bucket[i]);
            }
        }
        
        return ret;
	    
	    
	}
	


}
