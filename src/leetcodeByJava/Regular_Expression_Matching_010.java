/**
 * tzzhang
 * 下午10:32:23
 */
package leetcodeByJava;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月5日
 */
public class Regular_Expression_Matching_010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
	}
	public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean first_match = (!s.isEmpty() &&
                               (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*'){
            return (isMatch(s, p.substring(2)) ||
                    (first_match && isMatch(s.substring(1), p)));
        } else {
            return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
	 
}
