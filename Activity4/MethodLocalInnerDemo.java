/**
 * 
 */
package javaTrack;

/**
 * @author shahm
 *
 */
class MethodLocalInnerDemo {

	/**When a program containing a local inner class is compiled, the compiler generate 
	 * two .class files, one for the outer class and the other for the inner class that has 
	 * the reference to the outer class. The two files are named by compiler as:
	 * Outer.class
	 * Outer$1Inner.class
	 */
	
	private void getValue() {
		int sum = 20;
		//static class MethodLocalInner
		/**causes compilation error because the inner class cannot be declared 
		 * as static. Inner classes are associated with the block they are defined within and 
		 * not with the external class(Outer in this case).
		 */
		// private class MethodLocalInner
		// public class MethodLocalInner
		// protected class MethodLocalInner
		/**Illegal modifier for the local class MethodLocalInner; 
		 * only abstract or final is permitted
		 */
	
		class MethodLocalInner {
			public int divisor;
			public int remainder;
			
			
			public MethodLocalInner()
            {
                divisor = 4;
                //sum = 50; 
                /**Note :- A local class can access local variables and parameters of the enclosing block 
                 * that are effectively final.
    			 * Because of this assignment statement, the variable sum is not effectively final anymore. 
    			 * As a result, the Java compiler generates an error message similar to “local variables 
    			 * referenced from an inner class must be final or effectively final”.
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
                System.out.println("Inside inner class");
                return sum / divisor;
            }
		}
		MethodLocalInner inner = new MethodLocalInner();
        System.out.println("Divisor = "+ inner.getDivisor());
        System.out.println("Remainder = " + inner.getRemainder());
        System.out.println("Quotient = " + inner.getQuotient());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerDemo outer = new MethodLocalInnerDemo();
		//MethodLocalInner inner = new MethodLocalInner();
		/**causes compilation error because the scope of inner classes are restricted 
		 * to the block they are defined in.
		 */
        outer.getValue();

	}

}
