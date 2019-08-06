/**
 * tzzhang
 * 下午10:53:22
 */
package leetcodeByJava;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class implement_strstr_028 {
	
	 public static int strStr(String haystack, String needle) {
		 if (needle.equals("") || haystack.equals(needle)) {
			 return 0;
		 }
		 
		 for (int i = 0; i <= haystack.length()-needle.length() ; i++) {
			 System.out.println(haystack.subSequence(i, i + needle.length()));
			 if (haystack.subSequence(i, i + needle.length()).equals(needle)) {
				 return i;
			 }
		 }
		return -1;
		 
	 }
	 
	 public static void main(String[] args) {

			System.out.println(strStr("mississippi", "pi")); 

		}
	
}
