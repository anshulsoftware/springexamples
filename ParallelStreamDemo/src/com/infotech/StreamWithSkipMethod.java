package com.infotech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamWithSkipMethod {

	public static void main(String[] args) {
		Stream<String> onemod=Stream.of("abcd","bbcd","bccd").skip(1);
		//Stream<String> stream=onemod.skip(1);
		onemod.forEach(System.out::println);
		System.out.println("------------------------------");
		Stream<String> stream=Stream.of("abcd","bbcd","bcbd");
		Stream<String> twomod=stream.skip(1).map(e->e.substring(0, 3));
		twomod.forEach(System.out::println);
		System.out.println("===============================");
		List<String> list=Arrays.asList("abc1","abc2","abc3");
		long size=list.stream().skip(1).map(e->e.substring(0, 3)).sorted().count();
		System.out.println("Total count is "+size);
		
	}

}
