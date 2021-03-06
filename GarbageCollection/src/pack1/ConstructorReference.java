package pack1;
interface Messageable
{  
    Message getMessage(String msg);  
}  
class Message
{  
    Message(String msg)
    {  
        System.out.print(msg);  
    }  
}  
public class ConstructorReference 
{			
		public static void main(String[] args) 
		{ 
		/*
		  You can refer a constructor by using the new keyword. Here, we are
		  referring constructor with the help of functional interface.
		  
		  Syntax ClassName::new
		 */
	        Messageable hello = Message::new;  
	        hello.getMessage("Hello");  
	    }  
}


