//WAP using abstract class and interface to implemet the concept of palindrome , reverse , find the count of even digit , 
//find the count of odd digit , find out the count of repeated numbers

package abstraction;

import java.util.Scanner;

public abstract class abs {
	abstract void rverse();
	public void palindrome() 
	{
	int num,temp = 0,r=0,a;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number :");
	num=sc.nextInt();
	a=num;
	while(num>0) 
	{
		r=num%10;
		temp=(temp*10)+r;
		num=num/10;
	}
	if(temp==a)
	System.out.println(a+" is palindri=ome");
	else
		System.out.println(a+" is not a palindri=ome");
	}

}
