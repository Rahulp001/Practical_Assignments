import java.util.Scanner;

//Write a program to accept a number from the user and then outputs the number with the digits reversed. For example,
//if the input is 12345, the output should be 54321
public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
			
		}
		System.out.println("Reverse number is "+rev);

	}

}
