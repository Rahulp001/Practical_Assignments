//WAP to accept ano from user and check it is prime or not
import java.util.Scanner;
public class prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,m;
		int temp=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		m=num/2;
		if(num==0||num==1) {
			System.out.println(num+"is not a prime number ");
		} 
		   for(int i=2;i<=m;i++) {
			if(num%i==0)
			 temp=1;
			 break;
		   }
		   if(temp==0) {
			   System.out.println(num+" is  a prime number "); 
		   }
		   else
			   System.out.println(num+" is not a prime number ");   
	}

}
