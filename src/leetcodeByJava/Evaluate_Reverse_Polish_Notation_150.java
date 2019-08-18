/**
 * tzzhang
 * 下午10:16:05
 */
package leetcodeByJava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Evaluate_Reverse_Polish_Notation_150 {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((2));
		String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		
		System.out.println(evalRPN(tokens));
	}
	
	public static int evalRPN(String[] tokens) {
		Stack<Integer> s = new Stack<Integer>();
		for (String str : tokens) {
			if (Character.isDigit(str.charAt(0)) || (str.charAt(0)=='-' && str.toCharArray().length>1)) {
				s.push(Integer.parseInt(str));
			} else {
				
				if (str.equals("+")) {
					int a = s.pop();
					int b = s.pop();
					s.push(a+b);
				} else if (str.equals("-")) {
					int a = s.pop();
					int b = s.pop();
					s.push(b-a);
				}else if (str.equals("*")) {
					int a = s.pop();
					int b = s.pop();
					s.push(a*b);
				}else if (str.equals("/")) {
					int a = s.pop();
					int b = s.pop();
					s.push(b/a);
				}
			}
			
			
		}
		return s.pop();
	}
	
	 
	


}
