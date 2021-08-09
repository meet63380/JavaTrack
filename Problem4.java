/**
 * 
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class Problem4 {

	/**
	 * @param args
	 */
	public static void highestFeedBack(int medical[], int healthcare[], int size) {
		for(int i=0; i<size; i++) {
			if(medical[i]==0) {
				continue;
			}
			else {
				if(medical[i]>healthcare[i]) {
					System.out.println(i+1);
					System.out.println(medical[i]);
				}
				else {
					System.out.println(i+1);
					System.out.println(healthcare[i]);
				}
				healthcare[i] = 0;
					
			}
		}
		for(int i=0; i<size; i++) {
			if(healthcare[i]==0)
				continue;
			else {
				System.out.println(i+1);
				System.out.println(healthcare[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n<0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		else {
			int medical[] = new int[100];
			int healthcare[] = new int[100];
			int id,a;
			for (i=0; i<n; i++) {
				 id= sc.nextInt();
				 if(id < 0) {
						System.out.println("Invalid Input");
						System.exit(0);
					}
				 a = sc.nextInt();
				 if(a < 0) {
						System.out.println("Invalid Input");
						System.exit(0);
					}
				 if(id <= i) {
					 healthcare[id-1] = a;
				 }
				 else {
					 medical[id-1] = a;
				 }
				
			}
			highestFeedBack(medical, healthcare, n);
		}	
	}
}
