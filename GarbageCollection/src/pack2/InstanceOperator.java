package pack2;

interface I1
{
	public void m1();
}
class A implements I1
{
	public void m1()
	{
		System.out.println("method m1 in A");
	}
}
class B implements I1
{
	public void m1()
	{
		System.out.println("method m1 in B");
	}
}
public class InstanceOperator {

	public static void main(String[] args) throws ClassNotFoundException {
		/*Class c=Class.forName(args[0]);
		I1 i=(I1)c.newInstance();*/
		I1 i=new A();
		 i=new B();
		 if(i instanceof A)
		 {
			 i.m1();
		 }
		 else if(i instanceof B)
		 {
			 i.m1();
		 }
			 
	}

}
