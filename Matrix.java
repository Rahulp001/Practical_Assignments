package array;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        a=sc.nextInt();
        System.out.println("Enter the number of column");
        b=sc.nextInt();
        int [][] arr=new int [a][b];
        System.out.println("enter "+a*b+" numbers :");
        for(i=0;i<a;i++)
        {
        	for(j=0;j<b;j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Matrix is :");
        for(i=0;i<a;i++)
        {
        	for(j=0;j<b;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("transpose is :");
        for(i=0;i<b;i++)
        {
        	for(j=0;j<a;j++)
        	{
        		System.out.print(arr[j][i]+" ");
        	}
        	System.out.println();
        }
	}

}
