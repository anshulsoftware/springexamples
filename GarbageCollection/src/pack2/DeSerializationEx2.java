package pack2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyClass implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	int x=10;
	int y=20;
	void display()
	{
		System.out.println("Object context stored successfully");
	}
}
public class DeSerializationEx2 {

	public static void main(String[] args) throws IOException {
		MyClass m1=new MyClass();
		FileOutputStream fout = new FileOutputStream("D:\\out\\first.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(m1);
		m1.display();
	}

}
