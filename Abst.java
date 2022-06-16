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
