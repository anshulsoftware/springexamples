package pack3;

import java.util.ArrayList;
import java.util.List;

class Point
{
	Integer x,y;

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
}
public class GFG {

	public static void main(String[] args) {
		List<Point> list=new ArrayList<>();
		list.add(new Point(10,20));
		list.add(new Point(5,20));
		list.add(new Point(10,15));
		list.add(new Point(15,5));
		list.stream().sorted((p1,p2)->p1.x.compareTo(p2.x)).forEach(System.out::println);
		
	}

}
