package com.practice.JAVA8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LamdaDemo1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(2);list.add(1);list.add(3);list.add(5);
		
		
		list.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
		int max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		int min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
	}
}
