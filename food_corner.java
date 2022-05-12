package loop;

import java.util.Scanner;

public class food_corner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char ans;
			int choice,ch1;
			Scanner sc=new Scanner(System.in);
			System.out.println("\t\t----\tRahul Food Corner\t----\t\t");
			do
			{
				System.out.println("1:Starters\n2:Main Course\n3:Desert");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
						System.out.println("Starters Items");
						System.out.println("1:crispy ");
						System.out.println("2:manchurian");
						System.out.println("3:french fies");
						System.out.println("4:veg fry");
						ch1=sc.nextInt();
					break;
				case 2:
					System.out.println("Main Course Items");
					System.out.println("1:rice");
					System.out.println("2:maharaj thali");
					System.out.println("3:triple rice");
					System.out.println("4:triple noodles");
					ch1=sc.nextInt();
					break;
				case 3:
					System.out.println(" Desert Items");
					System.out.println("1:ice cream");
					System.out.println("2:gulab jamun");
					System.out.println("3:cake");
					System.out.println("4:hotel special");
					ch1=sc.nextInt();
					break;
				default:
					System.out.println("Invalid Item");
					break;
				
				}
				System.out.println("Do you want to add another Item Yes/No");
				ans=sc.next().charAt(0);
				
			}
			while(ans=='y'||ans=='Y');
			System.out.println("Thanks For coming");




	}

}
