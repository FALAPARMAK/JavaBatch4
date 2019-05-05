package com.class33;

import java.util.*;

public class BestBuy {

	public static void main(String[] args) {
		/*
		 * Create a map of Best Buy store. Place item id and item name into it. Example
		 * (7664847 = Printer, 7879885= TV etc ) Print all keys and values from a Best
		 * Buy map using EntrySet.
		 */

		Map<Integer, String> store = new LinkedHashMap();
		store.put(7664847, "Printer");
		store.put(7664848, "Tv");
		store.put(7664849, "Computer");

		System.out.println(store);
		for (Map.Entry<Integer, String> ent : store.entrySet()) {
			System.out.println(ent.getKey() + "= " + ent.getValue());
		}
		System.out.println("---------------------");
		Iterator<Map.Entry<Integer, String>> it = store.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			System.out.println(me.getKey() + "= " + me.getValue());
		}
	}

}
