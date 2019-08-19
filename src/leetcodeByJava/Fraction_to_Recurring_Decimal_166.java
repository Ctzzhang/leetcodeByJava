/**
 * tzzhang
 * 下午10:16:05
 */
package leetcodeByJava;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 * 
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Fraction_to_Recurring_Decimal_166 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 3, 1, 3, 4, 2 };
		//System.out.println(nums);
		//1
		//214748364
		System.out.println(fractionToDecimal(0,1));

	}

	public static String fractionToDecimal(int numerator, int denominator) {
		if (numerator == 0) {
			return 0+"";
		}
		boolean isfushu = true;
		BigInteger numeratorbig =new BigInteger(numerator+"");
		BigInteger denominatorbig =new BigInteger(denominator+"");
		
		if ((numeratorbig.compareTo(new BigInteger(0+"")) < 0 && denominatorbig.compareTo(new BigInteger(0+"")) < 0) 
				|| (numeratorbig.compareTo(new BigInteger(0+"")) > 0 && denominatorbig.compareTo(new BigInteger(0+"")) > 0)) {
			isfushu = false;
		}
		if (numeratorbig.compareTo(new BigInteger(0+"")) < 0) {
			numeratorbig = numeratorbig.multiply(new BigInteger(-1+""));
		}
		if (denominatorbig.compareTo(new BigInteger(0+"")) < 0) {
			denominatorbig = denominatorbig.multiply(new BigInteger(-1+""));
		}
		BigInteger zhenshu = numeratorbig.divide(denominatorbig);
		numeratorbig = numeratorbig.subtract(denominatorbig.multiply(zhenshu)); /* 求余数 */
		if (numeratorbig.compareTo(new BigInteger(0+"")) == 0) {
			StringBuilder sb2 = new StringBuilder();
			if (isfushu&&!zhenshu.toString().equals("0")) {
				sb2.append("-");
			}
			sb2.append(zhenshu.toString());
			return sb2.toString();
		}

		StringBuilder sb1 = new StringBuilder();
		if (isfushu) {
			sb1.append("-");
		}
		sb1.append(zhenshu).append(".");

		StringBuilder sb = new StringBuilder();
		Map<BigInteger, Integer> map = new HashMap<>();
		
		
		for (int a = 1; a < Integer.MAX_VALUE; a++) {
			map.put(numeratorbig, a);
			
			numeratorbig = numeratorbig.multiply(new BigInteger(10+""));
			BigInteger shang = numeratorbig.divide(denominatorbig);
			numeratorbig = numeratorbig.mod(denominatorbig);
			sb.append(shang.intValue());
			if (numeratorbig.compareTo(new BigInteger(0+"")) == 0) {
				break;
			} else {
				if (map.containsKey(numeratorbig)) {

					sb.insert(map.get(numeratorbig) -1, "(");
					sb.insert(sb.length(), ")");
					break;
				}
			}
		}
		return sb1.append(sb).toString();
	}
}
