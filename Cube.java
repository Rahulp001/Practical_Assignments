import java.util.*;

//WAP to accept a no from user if no is divisible by 7 than find out the cube.

public class Cube {

	public static void main(String[] args) {
		int num,res;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  a number");
		num=sc.nextInt();
		if(num%7!=0) {
			System.out.println("Invalid!Enter number divisible by 7");
		}
		else {
			res=num*num*num;
			System.out.println("the cube of given number is :"+res);
		}
		

	}

}
