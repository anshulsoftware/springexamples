package pack1;
interface Sayable
{
	 void say();
	 default void defaultMethod()
	 {
		 System.out.println("default method is define in interface");
	 }
	 
	 static void m1()
	 {
		 System.out.println("static method is define in interface");
	 }
}
class Aa implements Sayable
{
	public void say()
	{
		System.out.println("Hello this is override method");
	}
}
public class MethodReference 
{

	public void say()
	{
		System.out.println("Say define is override method");
	}
	
	public static void saySomething()
	{
		System.out.println("Hello , this is static method");
	}
	public static void main(String[] args) 
	{
		Sayable sayable=MethodReference::saySomething;
		//sayable.say();
		/*Sayable say=Aa::say;
		say.say();*/
		//Sayable.m1();
		MethodReference method = new MethodReference();
		Sayable say = method::say;
		say.say();
	}

}
