/**
 * tzzhang
 * 下午9:37:39
 */
package leetcodeByJava;

import java.math.BigDecimal;

/**
 * @author tzzhang
 * @version create on 2019年8月5日
 */
public class String_to_Integer_atoi_008 {
	 public static int myAtoi(String str) {
		 if (str == null || str.equals("")) {
			 return 0;
		 }
		 String ret = new String();
		 for (char ch : str.toCharArray()) {
			 if (ret.equals("") && ch == ' ') {
				 continue;
			 }
			 if(ret.equals("") && (ch == '-' || ch == '+')) {
				 ret += ch;
			 } else if ((ch >= '0' && ch <='9')) {
				 ret += ch;
			 }else {
				 break;
			 }
	
		 }
		
		if (ret.equals("")) {
			return 0;
		}
		if (ret.toCharArray()[0] == '+') {
			ret = ret.substring(1);
		}
		if (ret.equals("")) {
			return 0;
		}
		if (ret.toCharArray()[0] == '-' && ret.length() == 1) {
			return 0;
		}
		
		if (ret.equals("")) {
			return 0;
		}
		
		BigDecimal bd = new BigDecimal(ret);
		if (bd.compareTo(new BigDecimal(Integer.MIN_VALUE)) == -1) {
			return Integer.MIN_VALUE;
		}
		if (bd.compareTo(new BigDecimal(Integer.MAX_VALUE)) == 1) {
			return Integer.MAX_VALUE;
		}
		return Integer.parseInt(ret);
	 }
	 public static void main(String[] args) {
		 System.out.println(myAtoi("-91283472332"));
		 System.out.println(myAtoi("-4"));
		 System.out.println(myAtoi("   -42-"));
		 System.out.println(myAtoi("   -0 123"));
	 }
}
