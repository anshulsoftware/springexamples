package com.infotech;

import java.util.stream.Stream;

public class MergeArrayStream {

	public static void main(String[] args) {
		Integer a[]=new Integer[]{1,2,3};
		Integer b[]=new Integer[]{4,5,6};
		Object[] c=Stream.of(a,b).flatMap(Stream::of).toArray();
		//System.out.println(Arrays.toString(c));
		for(Object n:c)
		{
			System.out.print(n+" ");
		}
	}

}
