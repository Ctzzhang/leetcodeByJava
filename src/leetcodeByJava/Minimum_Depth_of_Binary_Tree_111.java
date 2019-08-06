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
public class Minimum_Depth_of_Binary_Tree_111 {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (root.left == null)
			return minDepth(root.right) + 1;
		if (root.right == null)
			return minDepth(root.left) + 1;
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
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
