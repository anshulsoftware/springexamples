package pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExa {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("11");
		list.add("21");
		list.add("3");
		list.add("4");
		list.add("5");
		Stream<String> str=list.parallelStream();
		str.forEach(System.out::println);
		System.out.println("================");
		/*Stream<String> stream=list.stream();
		Stream<String> distinct=stream.distinct();
		long count=distinct.count();*/
		Stream<String> stream=list.stream();
		long count=stream.distinct().count();
		System.out.println(count);
		//long count1=stream.count(); //stream can not reuse again
		long count1=list.stream().count();
		System.out.println(count1);
		System.out.println("---------------------");
		boolean b=list.stream().anyMatch(a->a.contains("12"));
		System.out.println(b);
		System.out.println("....................");
		Stream<String> filter=list.stream().filter(s->s.length()>1);
		filter.forEach(System.out::println);

	} 

}
