import java.util.Scanner;

public class logical_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println(num1>num2&&num1<num2);
		System.out.println(num1>num2||num1<num2);
		System.out.println(num1!=num2);

	}

}
