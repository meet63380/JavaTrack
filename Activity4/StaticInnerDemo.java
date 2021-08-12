/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class StaticInnerDemo {

	/**Static nested classes are not technically an inner class. 
	 * They are like a static member of outer class.
	 */
	static int sum = 20;
	
	
	static class StaticInner {
		public int divisor;
		public int remainder;
		
		
		public StaticInner()
        {
            
			divisor = 4;
            //sum = 50; 
            /**Note :- Static class can access another static non-final memebrs of outer class.
             * To access non-static members, we need to create an object of outer class.
			 */
            remainder = sum%divisor;
        }
		private int getDivisor()
        {
            return divisor;
        }
		private int getRemainder()
        {
            return remainder;
        }
		private int getQuotient()
        {
            System.out.println("Inside static inner class");
            return sum / divisor;
        }
	
    

public static void main(String[] args) {
	// TODO Auto-generated method stub
	//StaticInnerDemo outer = new StaticInnerDemo();
	StaticInner inner = new StaticInner();
	System.out.println("Divisor = "+ inner.getDivisor());
    System.out.println("Remainder = " + inner.getRemainder());
    System.out.println("Quotient = " + inner.getQuotient());

	}
}

}
