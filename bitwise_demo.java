import java.util.Scanner;

public class bitwise_demo {

	public static void main(String[] args) {
		int n1,n2,res1,res2,res3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		res1=n1&n2;
		res2=n1|n2;
		res3=n1^n2;
		System.out.println("the bitwise and of two number is: "+res1);
		System.out.println("the bitwise or of two number is: "+res2);
		System.out.println("the bitwise xor of two number is: "+res3);
		
        
	}

}
