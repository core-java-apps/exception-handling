package com.java.exception_handling;

public class App9 {
	public static void main(String[] args) {
		try {
			int i=10/0;

		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("throwable");
    	}// catch (Exception e) {
			// TODO: handle exception
		
	//	} catch (RuntimeException e) {
//			// TODO: handle exception
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//		}

		/**
		 * Unreachable catch block for Exception. It is already handled by the
		 * catch block for Throwable
		 */
	}
}
