package com.java.exception_handling;

public class App7 {
	public static void main(String[] args) {

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			displayStackTrace(e);

		}
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
