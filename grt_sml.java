import java.util.Scanner;

public class grt_sml {
int i,j,size,k=0;

	public static void main(String args[])
	{
		grt_sml obj = new grt_sml();
		obj.calc();
	}
	
	public int[] accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size:");
	 size=sc.nextInt();
	int arr1[]=new int[size];
	System.out.println("Enter a number:");
	for(i=0;i<size;i++)
	{
	     arr1[i]=sc.nextInt();
	}
	return arr1;
	}
	public void calc() {
	int arr1[]=accept();	
	int extra=arr1[k];
	for(j=0;j<size;j++)
	{
	     if(extra<arr1[j])
	      {
	     extra=arr1[j];
	       }
	 
	}
	System.out.println("Greater number from whole array is:"+extra);
	
	for(j=0;j<size;j++)
	{
	     if(extra>arr1[j])
	      {
	     extra=arr1[j];
	       }
	 
	}
	System.out.println("Smaller number from whole array is:"+extra);
	}
	

}
