package com.java.exception_handling;

public class App3 {
	public static void main(String[] args) {
		try {
			int i = 10 / 0;
			System.out.println(i);
		} catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println(e);

			System.out.println(e.getClass() + "--" + e.getMessage());

			// e.printStackTrace();
		}
		System.out.println("exit");
	}
}
