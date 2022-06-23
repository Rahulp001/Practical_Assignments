package abstraction;

public interface new_int {
	public void count();

}
---------------------------------------------------------------------------
package abstraction;

import java.util.Scanner;

public class Count_even implements new_int {
	long num,count = 0,r=0;;
	public static void main(String[] args) {
		Count_even obj = new Count_even();
		obj.count();
		
	}

	public void accept()
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		num=sc.nextLong();
	}
	@Override
	public void count() {
		// TODO Auto-generated method stub
		accept();
		System.out.println("even digits are :");
		while(num>0) 
		{
			r=num%10;
			if(r%2==0) 
			{
				count++;
				System.out.println(r);
			}
				num=num/10;
		}
		System.out.println("count of even digit "+count);
		
		
	}

}	
----------------------------------------------------------------------------------
package abstraction;

public class Count_odd extends Count_even implements new_int {
	public static void main(String[] args) {
		Count_odd obj = new Count_odd();
		obj.count();
		
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		accept();
		System.out.println("odd digits are :");
		while(num>0) 
		{
			r=num%10;
			if(r%2 !=0) 
			{
				count++;
				System.out.println(r);
			}
				num=num/10;
		}
		System.out.println("count of odd digit "+count);
		
		
		
	}

}
----------------------------------------------------------------------------------
package abstraction;

public class Count_repeat extends Count_odd implements new_int {
	public static void main(String[] args) {
		Count_repeat obj = new Count_repeat();
		obj.count();
		
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		long temp = 0;
		System.out.println("repeated digits are :");
		temp=num;
		while(num>0) 
		{
			r=num%10;
			temp=num%10;
			if(temp==r) 
			{
				count++;
				System.out.println(r);
			}
				num=num/10;
		}
		System.out.println("count of repeated digit "+count);
		
		
		
	}

}	
