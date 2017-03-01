package com.java.exception_handling;

public class App14 {
	public static void main(String[] args) {

		try {
			System.out.println("try-1");
			m1(0);
		} finally {
			System.out.println("finally-1");
		}

	}

	public static void m1(int j) {
		int i = 10 / j;

	}
}
