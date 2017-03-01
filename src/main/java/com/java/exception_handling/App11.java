package com.java.exception_handling;

public class App11 {
	public static void main(String[] args) {

		try {
			m1();
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("Inside throwable");
			StackTraceElement[] s1 = e.getStackTrace();
			for (StackTraceElement o : s1) {
				System.out.println(o);
			}
			System.out.println(e.getMessage());
		}
		System.out.println("exit");
	}

	public static void m1() {
		throw new OutOfMemoryError("Please increase memory");
		// System.out.println("hello");//compilation problem:Unreachable code

	}
}
