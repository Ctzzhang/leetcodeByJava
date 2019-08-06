/**
 * tzzhang
 * 下午10:53:22
 */
package leetcodeByJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Binary_Tree_Level_Order_Traversal_102 {

	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (null == root) {
			return list;
		}
		queue.add(root);
		while (!queue.isEmpty()) {
			int len = queue.size();
			List<Integer> alist = new ArrayList<Integer>();
			for (int i = 0; i< len ; i++) {
				TreeNode a = queue.poll();
				alist.add(a.val);
				if (null != a.left) {
					queue.add(a.left);
				}
				if (null != a.right) {
					queue.add(a.right);
				}
			}
			list.add(alist);
		}
		return list;
    }		
	
}
