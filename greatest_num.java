//WAP to accept two no from user and find out the greatest
import java.util.*;
public class greatest_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+" is the greatest number");
		}else {
			System.out.println(num2+" is the greatest number");
		}
        
	}

}
