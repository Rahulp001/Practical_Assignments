import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class positve_negative {

	public static void main(String[] args) {
		int a,i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of number ");
		a=s.nextInt();
		int[] arr =new int[a];
		System.out.println("Now enter "+a+" numbers:");
		for( i=0;i<a;i++) {
			arr[i]=s.nextInt();
		}
		for( i=0;i<a;i++) {
		if (arr[i]==0) {
			System.out.println("zero number :"+arr[i]);
		}
		else if (arr[i]>0) {
			System.out.println("positive number :"+arr[i]);
		}
		else {
			System.out.println("negative number :"+arr[i]);
		}
		}
	}

}
