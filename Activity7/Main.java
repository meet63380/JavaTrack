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
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender send = new Sender();
        ThreadedSend S1 =
            new ThreadedSend( " Hi " , send );
        ThreadedSend S2 =
            new ThreadedSend( " Bye " , send );
 
        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();
 
        // wait for threads to end
        try
        {
            S1.join();
            S2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }

	}

}
