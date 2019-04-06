package com.class17_2;

import java.util.Scanner;

class ScannerMethod {//default method

	public static void main(String[] args) {
		ScannerMethod obj = new ScannerMethod();

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(obj.sum(a, b));// int c=obj.sum(a,b));  same
		obj.sum(100, 100);
		obj.sub();
	}

	   public int sum(int x, int y) {// private ,protected
		System.out.println(x + y);
		return x + y;
	}

	void sub() {
		int a = 10;
		int b = 12;
		System.out.println(a - b);
	}
}
