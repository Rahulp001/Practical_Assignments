package Ecapsulation;

import java.util.Scanner;

public class Encapsul2 extends Encapsul{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsul2 obj1= new Encapsul2();
		obj1.disp();;

	}
	public int[] accept() 
	{
		int val,i;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Name ");
		student_name=sc.nextLine();
		System.out.println("Enter phone No ");
		phone_no=sc.nextInt();
		System.out.println("Enter roll no ");
		val=sc.nextInt();
		setRoll_no(val);
		int [] arr=new int[5];
		System.out.println("enter the markes of five subject from 100");
		
		for(i=0;i<5;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		return arr;
		
	}
	public void disp() 
	{
		
		calc();
		System.out.println("name "+student_name);
		System.out.println("roll no "+getRoll_no());
		System.out.println("phone no "+phone_no);
		grade();
	}

}
