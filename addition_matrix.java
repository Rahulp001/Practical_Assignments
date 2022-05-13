package array;

import java.util.Scanner;

public class addition_matrix {

	public static void main(String[] args) {
		int a,b,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        a=sc.nextInt();
        System.out.println("Enter the number of column");
        b=sc.nextInt();
        int [][] arr=new int [a][b];
        System.out.println("enter first matrix "+a*b+" numbers :");
        for(i=0;i<a;i++)
        {
        	for(j=0;j<b;j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}
        }
        System.out.println("first Matrix is :");
        for(i=0;i<a;i++)
        {
        	for(j=0;j<b;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        int [][] arr1=new int [a][b];
        System.out.println("enter second matrix "+a*b+" numbers :");
        for(i=0;i<a;i++)
        {
        	for(j=0;j<b;j++)
        	{
        		arr1[i][j]=sc.nextInt();
        	}
        }
        System.out.println("second Matrix is :");
        for(i=0;i<a;i++)
        {
        	for(j=0;j<b;j++)
        	{
        		System.out.print(arr1[i][j]+" ");
        	}
        	System.out.println();
        }
        int [][] arr2=new int [a][b];
        System.out.println("addition Matrix is :");
        for(i=0;i<a;i++)
        {
        	for(j=0;j<b;j++)
        	{
        		arr2[i][j]=arr[i][j]+arr1[i][j];
        		System.out.print(arr2[i][j]+"\t");
        	}
        	System.out.println();
        }
       

	}

}
