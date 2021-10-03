package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class TestPoint {
 public static void main(String[] args) {
//	 Point p1=new Point(1,2);
//	 Point p2=p1;
//	 Point p3=new Point(1,2);
//	 System.out.println(p1==p2);
//	 System.out.println(p1==p3);
	  
	 Point p1=new Point(1,2);
	 Point p2=p1;
	 Point p3=new Point(1,2);
	
	 ArrayList<Point> list = new ArrayList<>();
	 list.add(p1);
	 System.out.println(list.indexOf(p2));
	 System.out.println(list.indexOf(p3));
	 
	 Circle c=new Circle(new Point(1,2), 1);
	 c.getCenter().translate(1,1);
	 System.out.println(c);


}
}
