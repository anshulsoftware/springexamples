package pack2;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		String arr[]=new String[]{"A","B","C"};
		Stream<String> str=Arrays.stream(arr);
		str.forEach(System.out::println);//This is one way to use Stream Class
		
		Stream<String> str1=Stream.of("A","B","C");//This is 2nd way to use Stream Class
		
		str1.forEach(System.out::println);
		
	}

}
