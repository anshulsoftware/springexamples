package pack1;
enum Season { WINTER, SPRING, SUMMER, FALL; }//semicolon(;) is optional here  
public class EnumExample2 {

	public static void main(String[] args) 
	{
		Season s=Season.WINTER;  //enum type is required to access WINTER 
		System.out.println(s); 

	}

}
