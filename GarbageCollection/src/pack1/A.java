package pack1;
interface I
{
	public void m1();
	public void m2();
	default void m3()
	{
		System.out.println("this is default");
	}
	static void m4()
	{
		System.out.println("this is default");
	}
}
/*abstract class B
{
	public abstract void m1();
	public abstract void m2();
	public void m3()
	{
	System.out.println("this is m3()");	
	}
	public static void m4()
	{
		System.out.println("this is static method");
	}
}*/
class Test //extends B
{
	public void m1()
	{
		System.out.println("Hello M1");
	}
	public void m2()
	{
		System.out.println("Hello M2");
	}
}
public class A {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();

	}

}
