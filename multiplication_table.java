//WAP to accept a no from the user and display the multiplication table 1*1=1
package loop;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number for multiplication table");
		num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int res=num*i;
		    System.out.println(num+"*"+i+"="+res);
		
		}
		

	}

}
