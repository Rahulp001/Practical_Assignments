import java.util.Scanner;

//WAP to accept a no from user and check it is armstrong or not from  1 to 1000
public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1,r ,s=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		num1=num;
	  if(num<=1000) {
		do {
			 r=num%10;
			s=s+r*r*r;
			num=num/10;
		}while(num>0);
		
	    if(num1==s) {
		   System.out.println("\n its a armstrong number");
	   }
	   else
		   System.out.println("\n its not a armstrong number");
	}
	  else
		  System.out.println("invalid number! Enter number from 1 to 1000");
	}
}
