package com.class33;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a map of a building. Store floor number and it is associated company
		 * name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate
		 * keys and values. Check how many entries you have? Update company on a 4th
		 * floor Remove company on the 7th floor Print your map
		 */

		Map<Integer,String>floorNum=new HashMap<>();
		floorNum.put(1, "Google");
		floorNum.put(2, "Syntax");
		floorNum.put(3, "Google");
		floorNum.put(4, "Apple");
		floorNum.put(4, "Windows");
		floorNum.put(5, "Browser");
		floorNum.put(6, "FireFox");
		floorNum.put(7, "Amazon");
		System.out.println(floorNum);
		
		floorNum.put(4,"Moto");
		System.out.println(floorNum);
		floorNum.remove(7);
		System.out.println(floorNum);
		
	}

}
