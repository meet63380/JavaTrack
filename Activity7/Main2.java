/**
 * This is done using Runnable interface with lambda
 */
package javaTrack;
import java.util.*;
/**
 * @author shahm
 *
 */
class Main2 {

	static void printArray(SortScore2 obj) {
        System.out.println("Match: "+ obj.getMatchType());
        
        int a[] = obj.getScores();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String matchType, scores;
		System.out.println("Enter the Match:");
		matchType = sc.nextLine();
		System.out.println("Enter the Scores:");
		scores = sc.nextLine();
		SortScore2 obj1 = new SortScore2(matchType, scores);
		
		Runnable r1 = () -> {
			Arrays.sort(obj1.getScores());
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		System.out.println("Enter the Match:");
		matchType = sc.nextLine();
		System.out.println("Enter the Scores:");
		scores = sc.nextLine();
		SortScore2 obj2 = new SortScore2(matchType, scores);
		Runnable r2 = () -> {
			Arrays.sort(obj2.getScores());
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		System.out.println("Enter the Match:");
		matchType = sc.nextLine();
		System.out.println("Enter the Scores:");
		scores = sc.nextLine();
		SortScore2 obj3 = new SortScore2(matchType, scores);
		Runnable r3 = () -> {
			Arrays.sort(obj3.getScores());
		};
		Thread t3 = new Thread(r3);
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		printArray(obj1);
		printArray(obj2);
		printArray(obj3);
		
		sc.close();

	}

}
