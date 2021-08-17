/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class ThreadedSend extends Thread {
	private String msg;
    Sender  sender;
 
    // Receives a message object and a string
    // message to be sent
    ThreadedSend(String m,  Sender obj)
    {
        msg = m;
        sender = obj;
    }
    //synchronized public void run(
//    Sending	 Hi 
//    Sending	 Bye 
//
//     Hi Sent
//
//     Bye Sent
//    or
//    Sending	 Bye 
//    Sending	 Hi 
//
//     Bye Sent
//
//     Hi Sent

    

    public void run()
    {
        // Only one thread can send a message
        // at a time.
//      Sending	 Hi 
    	//
//    	    Hi Sent
    	//   Sending	 Bye 
    	//
//    	    Bye Sent
        synchronized(sender)
        {
            // synchronizing the send object
            sender.send(msg);
        }
    }

}
