package pack1;

interface I1
{
	public void draw();
}
public class LamdaExpression {

	public static void main(String[] args) {
		
I1 i=()->
	System.out.println("hello this is lamda expression");

i.draw();
	}

}
