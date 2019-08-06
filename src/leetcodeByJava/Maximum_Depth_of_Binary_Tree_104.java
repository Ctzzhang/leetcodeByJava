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
public class Maximum_Depth_of_Binary_Tree_104 {
	public int maxDepth(TreeNode root) {
		if (null == root) {
			return 0;
		}
		if (null == root.left && null == root.right) {
			return 1;
		}
		return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
}
