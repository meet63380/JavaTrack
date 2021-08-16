/**
 * 
 */
package javaTrack;
import java.io.*;
import java.util.*;
/**
 * @author shahm
 *
 */
class FIleCopy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Source File: ");
        String sourceFile = "C:\\Users\\shahm\\eclipse-workspace\\FileActivity\\src\\javaTrack\\" + sc.nextLine();
        System.out.println("Enter Destination File: ");
        String destinationFile = "C:\\Users\\shahm\\eclipse-workspace\\FileActivity\\src\\javaTrack\\" + sc.nextLine();
        FileReader fr = new FileReader(sourceFile);
        FileWriter fw = new FileWriter(destinationFile, true);
        int temp;
        while ((temp = fr.read()) != -1) {
            fw.write(temp);
        }
        System.out.println("Finished Copying the File");
        fr.close();
        fw.close();

        sc.close();

	}

}
