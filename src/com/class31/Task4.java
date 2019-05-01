package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
	/*
	 * .Create an arrayList of even numbers from 1 to 50. Using Iterator remove any
	 * number that is divisible by 5 from that arrayList.
	 * 
	 */

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i <= 50; i++) {
			if (i %2 == 0) {
				num.add(i);
			}

		}
		System.out.println(num);
		Iterator<Integer> it = num.iterator();
		while (it.hasNext()) {
			int number = it.next();
			if (number % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(num);

	}

}
