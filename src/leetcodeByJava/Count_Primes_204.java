/**
 * tzzhang
 * 下午10:16:05
 */
package leetcodeByJava;

/**
 * TODO
 * @author tzzhang
 * @version create on 2019年8月6日
 */
public class Count_Primes_204 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(2));
	}
	public static int countPrimes(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)){
				count ++;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int num) {   
	       for(int i = 2; i <= Math.sqrt(num); i++) {//程序默认2是素数，当j=2时，循环不执行
	           if(num % i == 0) {
	             return false;
	           }
	       }
	       return true;
	    }

}
