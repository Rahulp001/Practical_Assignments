package array;

import java.util.Scanner;

public class Array_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,extra;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size.");
		size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Now enter "+size+" numbers:");
		
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The NUmbers are");
		for(i=0;i<size;i++)
		{	
			System.out.print(arr[i]+"\t");
		}
		extra=arr[0];
		for(i=0;i<size;i++)
		{
			if(extra<arr[i])
			{
				extra=arr[i];
			}
		}
		System.out.println("The greater no is ="+extra);

	}

}
