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
public class Word_Search_79 {
	
	public boolean exist(char[][] board, String word) {
		if (word.length() == 0) {
			return false;
		}
		
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (dfs(board, word, i, j, 0)) {
					return true;
				}
			}
		}
		
		return false;
    }

	/**
	 * @param board
	 * @param word
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	private boolean dfs(char[][] board, String word, int i, int j, int index) {
		if (index == word.length()) {
			return true;
		}
		if (i>=board.length || j >= board[0].length || i<0 || j < 0) {
			return false;
		}
		
		if (board[i][j]!= word.charAt(index)) {
			return false;
		}
		char curr = board[i][j];
		board[i][j] = ' '; 
		boolean up = dfs(board, word, i+1, j, index+1);
		if (up) {
			return true;
		}
		boolean down = dfs(board, word, i-1, j, index+1);
        if (down) {
            return true;
        }
        boolean left = dfs(board, word, i, j-1, index+1);
        if (left) {
            return true;
        }
        boolean right = dfs(board, word, i, j+1, index+1);
        if (right) {
            return true;
        }
        board[i][j] = curr;
        
		
		return false;
	}
}
