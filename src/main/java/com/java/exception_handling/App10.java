package com.java.exception_handling;

public class App10 {
	public static void main(String[] args) {

		try {
			int i = 10 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("AE");
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("RE");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("E");
		} catch (Throwable e) {
			// TODO: handle exception
		}

		System.out.println("exit");
	}
}
