package pack1;

import java.util.StringJoiner;

public class StringJoinerexample3 {

	public static void main(String[] args) {
		  StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
          
	        // Adding values to StringJoiner  
	        joinNames.add("Rahul");  
	        joinNames.add("Raju");  
	  
	        // Creating StringJoiner with :(colon) delimiter  
	        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
	          
	        // Adding values to StringJoiner  
	        joinNames2.add("Peter");  
	        joinNames2.add("Raheem");  
	  
	        // Merging two StringJoiner  
	        StringJoiner merge = joinNames.merge(joinNames2);   
	        System.out.println(merge); 
	        int len=merge.length();
	        System.out.println("\n "+"Length of String is"+" "+len);

	}

}
