package com.java.exception_handling;

public class App8 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			// TODO: handle exception
			displayStackTrace(e);
		}
		System.out.println("exit");
	}

	public static void m1() {
		m2();
	}

	public static void m2() {
		int i = 10 / 0;
	}

	public static void displayStackTrace(Exception e) {
		System.out.println(e);
		StackTraceElement[] arr = null;
		arr = e.getStackTrace();
		for (StackTraceElement elem : arr) {
			System.out.println("\t" + elem.toString());

		}
	}
}
