package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyClass implements Serializable
{
	
	
	
	private static final long serialVersionUID = 1L;
	int x;
	int y;
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
public class DeSerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		MyClass m1;
		
		FileInputStream fis = new FileInputStream("D:\\out\\first.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o=ois.readObject();
		m1=(MyClass)o;
		
		m1.display();
		ois.close();
	}

}
