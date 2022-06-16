package abstraction;

import java.util.Scanner;

abstract class Abst {

	abstract void dia();
	public void peri() 
	{
		int l,w;
		Scanner sc =new Scanner (System.in);
		System.out.println("perimeter of rectange");
		System.out.println(" enter lenghth and width of rectange");
		l=sc.nextInt();
		w=sc.nextInt();
		int per = 2*(l+w);
		System.out.println("perimeter of rectangle "+per);
	}

}
public class Main extends Abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Main obj = new Main();
	    obj.dia();
	    obj.peri();
	    rectangle obj1 = new rectangle();
	    obj1.area();
	    Circle obj2 = new Circle();
	    obj2.area();
	    Cylinder obj3 = new Cylinder();
	    obj3.area();
	    
	    
	}

	@Override
	void dia() {
		// TODO Auto-generated method stub
		int l,w;
		Scanner sc =new Scanner (System.in);
		System.out.println("daigonal of rectange");
		System.out.println(" enter lenghth and width of rectange");
		l=sc.nextInt();
		w=sc.nextInt();
		double d=Math.sqrt((w*w)+(l*l));
		System.out.println("daigonal of rectangel:"+d);
		
	}

}
package abstraction;

public interface Int {
	public void area();

}
package abstraction;

import java.util.Scanner;

public class rectangle implements Int{

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int l,w;
		Scanner sc =new Scanner (System.in);
		System.out.println("Area of rectange");
		System.out.println(" enter lenghth and width of rectange");
		l=sc.nextInt();
		w=sc.nextInt();
		System.out.println(" Area of rectangle :"+(l*w));
		
	}

}
package abstraction;

import java.util.Scanner;

public class Circle implements Int {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int l;
		float pi=(float) 3.14;
		Scanner sc =new Scanner (System.in);
		System.out.println("Area of circle");
		System.out.println(" enter radius of cirlce");
		l=sc.nextInt();
		float a=pi*l*l; 
		System.out.println(" Area of rectangle :"+a);
		
	}

}
package abstraction;

import java.util.Scanner;

public class Cylinder implements Int {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		int l,w;
		double pi=3.14;
		Scanner sc =new Scanner (System.in);
		System.out.println("Area of cylinder");
		System.out.println(" enter radius and height of cylinder");
		l=sc.nextInt();
		w=sc.nextInt();
		double a= (2*pi*l*w)+(2*pi*l*l);
		System.out.println(" Area of rectangle :"+a);
	}

}
