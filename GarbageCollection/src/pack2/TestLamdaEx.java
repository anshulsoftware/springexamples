package pack2;
interface Sayable
{
	public int say(int a, int b, int c);
}
public class TestLamdaEx {

	public static void main(String[] args) {
		Sayable s=(a,b,c)->{
			return (a+b+c);
		};
		System.out.println(s.say(1,2,3));
	}

}
