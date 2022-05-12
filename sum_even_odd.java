import java.util.Scanner;

public class sum_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,r,s=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		while(num>0) {
			r=num%10;
			if (r%2==0) {s=s+r;}
			else {sum=sum+r;}
			num=num/10;
			
		}
		 {
		System.out.println("sum of even number is "+s);
		System.out.println("sum of odd number is "+sum);
		}
	}

}
