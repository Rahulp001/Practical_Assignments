package array;

import java.util.Scanner;

public class array_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int arr1[];
		arr1=new int[78];
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly enter 10 Numbers");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Numbers are:");
		for(i=0;i<10;i++)
		{
			System.out.println("Numbers:"+arr[i]);
		}
	}

}
