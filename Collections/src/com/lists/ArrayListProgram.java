package com.lists;

import java.util.ArrayList;

public class ArrayListProgram {
	public static void main(String[] args) {
		
		ArrayList li = new ArrayList();
		li.add(1);
		li.add("Manivas");
		li.add(5.9);
		li.add(true);
		li.add('M');
		li.add(1);
		
		li.add(1, "Vamsi");
		System.out.println(li);
		
		li.set(3, 5.11);
		System.out.println(li);
		
		li.remove(1);
		System.out.println(li);
		
		System.out.println(li.contains('M'));
		System.out.println(li.indexOf(1));
		System.out.println(li.lastIndexOf(1));
		System.out.println(li);
		System.out.println("size : "+li.size());
		System.out.println(li.get(1));
		
		ArrayList li2 = new ArrayList();
		li2.addAll(li);
		System.out.println(li2);
		
		li2.clear();
		System.out.println(li2);
		System.out.println(li.isEmpty());
		System.out.println(li2 .isEmpty());

		
		
	}

}
