import java.util.Scanner;

public class add_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1,r ,s=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		num1=num;
		while(num>0) {
			 r=num%10;
			s=s+r*r*r;
			num=num/10;
		}
		System.out.println("the addition of  cube of digits " +s);
	
	   if(num1==s) {
		   System.out.println("\n its a armstrong number");
	   }
	   else
		   System.out.println("\n its not a armstrong number");
}
}
