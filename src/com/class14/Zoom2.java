package com.class14;

public class Zoom2 {

	public static void main(String[] args) {

		int[] num = { 10, 56, 89, 45, 100, 345, 129, 7, 9 };
		int max = num[0];
		int secMax = num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}

		}
		System.out.println("Minumum number is : " + min);
		System.out.println("Maximum number is : " + max);

		for (int i = 0; i < num.length; i++) {
			if (num[i] > secMax && num[i] < max) {
				secMax = num[i];
			}
		}
		System.out.println("Second large number is : " + secMax);
	}

}
