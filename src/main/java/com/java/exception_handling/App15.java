package com.java.exception_handling;

public class App15 {
	public static void main(String[] args) {

		System.out.println("case-1");
		int i = m1(20);
		System.out.println(i);// try-finally 30

		System.out.println("case-2");
		i = m1(0);
		System.out.println(i);
	}

	@SuppressWarnings("finally")
	public static int m1(int j) {
		int i = 0;

		try {
			System.out.println("try");
			i = 100 / j;
			System.out.println(i);
			return 10;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch" + e);
			return 20;
		} finally {
			System.out.println("finally");
			return 30;
		}
	}
}
