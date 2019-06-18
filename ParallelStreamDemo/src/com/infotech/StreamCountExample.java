package com.infotech;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCountExample {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<>();
		
		list.add("PK");
		list.add("KK");
		list.add("MK");
		list.add("PC");
		/*List<String> li=list.stream().collect(Collectors.toList());
		li.add(2, "Ak");
		li.remove(1);*/
		List<String> s= list.stream().collect(Collectors.toList());
		s.forEach(System.out::println);
	}

}
