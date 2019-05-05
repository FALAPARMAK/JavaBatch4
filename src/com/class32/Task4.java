package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4 {

	public static void main(String[] args) {
		
		List<Integer>num=Arrays.asList(new Integer[]{1,3,2,4,5,2,6,6,9});
		
		System.out.println(num);
		
		
		
		
		HashSet<Integer>hset=new HashSet<>(num);
		//Collections.sort(hset);  Sort collectionsta calismiyor
		System.out.println(hset);
		
		ArrayList<Integer>number=new ArrayList<>(hset);
		Collections.sort(number);
		System.out.println(number);

	}

}
