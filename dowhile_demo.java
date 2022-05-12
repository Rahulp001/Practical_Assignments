package loop;

import java.util.Scanner;

public class dowhile_demo {

	public static void main(String[] args) {
		int choice;
		char ans;
		Scanner sc =new Scanner(System.in);
		System.out.println("---RAhul Divine food---");
		do {
			System.out.println("1.Starter\t2.Main Course\n3.Desserts\t4.Beverages");
			ans=sc.next().charAt(0);;
			
		}while(ans=='y'||ans=='Y');
		System.out.println("thank you comming");

	}

}
