package pack2;

interface I11
{
	void say();
	
}
class Client 
{
	public static void m1()
	{
		System.out.println("Hello this class method()");
	}
	public static void m2()
	{
		System.out.println("this Number 2 method");
	}
	public void m3()
	{
		System.out.println("this is instance method()");
	}
	
	Client(String str)
	{
		System.out.println(str);
	}
}

public class Test {

	public static void main(String[] args) {
		Client cl=new Client("hello constructor");
		
	I11	i1=Client::m1;
	I11	i2=Client::m2;
	I11	i3=cl::m3;
		i1.say();
		i2.say();
		i3.say();
		
		
	}

}
