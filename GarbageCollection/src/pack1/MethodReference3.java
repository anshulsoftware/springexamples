package pack1;

import java.util.function.BiFunction;

class Arithmetic
{
	public static int add(int a,int b)
	{
		return a+b;
	}
}
public class MethodReference3 {

	public static void main(String[] args) {
		BiFunction<Integer,Integer, Integer> addr=Arithmetic::add;
		int result =addr.apply(10, 20);
		System.out.println(result);

	}

}
