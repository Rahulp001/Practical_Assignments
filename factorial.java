//WAP to accept ano from user and find out the factorial
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,res = 1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number for factorial:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			res=res*i;
		}
		System.out.println("factorial :"+res);

	}

}
