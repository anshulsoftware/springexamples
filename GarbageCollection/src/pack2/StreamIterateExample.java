package pack2;

import java.util.stream.Stream;

public class StreamIterateExample {

	public static void main(String[] args) {

		Stream.iterate(1,count->count+1)
		.filter(number->number%3==0)
		.limit(10)
		.forEach(System.out::println);
	}

}
