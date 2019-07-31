package pack1;
@FunctionalInterface
interface I2
{
	public String draw();
}
public class LamdaExpression1 {

	public static void main(String[] args) {
		I2 i=()->{
			return "Hey this return type";
		};
		
		System.out.println(i.draw());
	}

}
