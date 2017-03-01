package com.java.exception_handling;

public class App12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e+"***");
		}
		
	}

	public static void m1() {
		m2();
	}

	public static void m2() {
		m1();
	}

}
