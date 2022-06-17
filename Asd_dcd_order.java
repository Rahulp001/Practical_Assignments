import java.util.Scanner;
public class Asd_dcd_order {
	int size,temp=0,i,j;
	
	public static void main(String args[])
	{
		Asd_dcd_order obj = new Asd_dcd_order();
		obj.acend_dec();;
		
	}
	public int[] accept() 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enter the array elements:");
		for(i=0;i<size;i++)
		{
		      arr1[i]=sc.nextInt();
		}
		return arr1;
		
	}
	public void acend_dec() {
		
	int arr1[]=accept();
	System.out.println("Your array elements:");
	for(int i=0;i<size;i++)
	{
	System.out.println(arr1[i]);
	}
	for(int i=0;i<size;i++)
	{
	for(int j=i+1;j<size;j++)
	{
	   if(arr1[i]>arr1[j])
	             {
	             temp=arr1[i];
	             arr1[i]=arr1[j];    
	              arr1[j]=temp;
	             }

	}
	}
	System.out.println("Your ascending array elements:");
	for(int i=0;i<size;i++)
	{
	System.out.println(arr1[i]);
	}
	System.out.println("Your array elements:");
	for(int i=0;i<size;i++)
	{
	System.out.println(arr1[i]);
	}
	for(int i=0;i<size;i++)
	{
	for(int j=i+1;j<size;j++)
	{
	   if(arr1[i]<arr1[j])
	             {
	             temp=arr1[i];
	             arr1[i]=arr1[j];    
	              arr1[j]=temp;
	             }

	}
	}
	System.out.println("Your descending array elements:");
	for(int i=0;i<size;i++)
	{
	System.out.println(arr1[i]);
	}

	

	}
	
}
