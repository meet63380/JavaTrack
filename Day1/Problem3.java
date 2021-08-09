/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class Problem3 {

	/**
	 * @param args
	 */
	public int productDigits(int a) {
		if(a < -1 || a > 32767) {
			return -1;
		}
		else {
			int product=1;
			while(a > 0) {
				product *= a % 10;
				a = a / 10;
			}
			return product;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Problem3 pObj = new Problem3();
		int result = pObj.productDigits(num);
		System.out.println((result>-1)?result:"Invalid Input");
	}

}
