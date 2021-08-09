/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class Problem2 {

	/**
	 * @param args
	 */
	
	public static int countRepeaters(int[] arr, int n) {
		int i,j,k,count=1;
		for(i=0; i<n; i++) {
			for(j=i+1; j<n;) {
				if(arr[i] == arr[j]) {
					count++;
					for(k=j; k<n; k++)
						arr[k] = arr[k+1];
					n--;
				}
				else {
					j++;
				}
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n<0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		else {
			int arr[] = new int[20];
			for (i=0; i<n; i++) {
				arr[i] = sc.nextInt();
				if(arr[i] < 0) {
					System.out.println("Invalid Input");
					System.exit(0);
				}
			}
			
		System.out.println(countRepeaters(arr, n));
				
		}
	}
}

