package pack1;

import java.util.StringJoiner;

public class StringJoinerExample2 {

	public static void main(String[] args) {
		
		StringJoiner joinNames = new StringJoiner(",", "[", "]");   
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);

	}

}
