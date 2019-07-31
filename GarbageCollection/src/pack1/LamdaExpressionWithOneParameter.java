package pack1;
interface I3
{
	public String sayHello(String name);
}
public class LamdaExpressionWithOneParameter {

	public static void main(String[] args) 
	{
		
     I3 i=(name)->{
    	 
    	 for(int j=0;j<=10;j++)
    	 {
    		 System.out.println(j);
    	 }
         return "Hello"+" "+name;
     			};
     System.out.println(i.sayHello("Amit"));
	 
	 I3 i1= name->{
	     return "Hello"+" "+name;
	     };
	     System.out.println(i1.sayHello("Arjun"));
	}
}

