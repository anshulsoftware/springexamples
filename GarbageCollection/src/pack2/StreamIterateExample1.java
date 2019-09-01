package pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterateExample1 {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("10");
		li.add("20");
		li.add("30");
		li.add("40");
		li.add("50");
		Stream<String> s=li.stream();
		//Stream<Integer> s1=(Stream<Integer>) s.iterator();
		Object[] o=s.toArray();
		for(Object o1:o)
		{
			System.out.println(o1);
		}
		System.out.println();
		li.stream().forEach(System.out::println);
		System.out.println();
		
//		List<Employee> empList = new ArrayList<>();
//		empList.add(new Employee("Ashish"));
//		empList.add(new Employee("SUMIT"));
//		empList.add(new Employee("Nishant"));
//		empList.add(new Employee("Yash"));

		List<Employee> empList= Stream.of(new Employee("Ashish"),new Employee("SUMIT")).collect(Collectors.toList());
		empList.stream().forEach(emp -> System.out.println(emp.name));
	}

}
class Employee{
	String name;

	public Employee(String name) {
		this.name = name;
	}
	
}