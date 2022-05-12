package loop;

import java.util.Scanner;

public class for_loop_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int min,max;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the min Value");
				min=sc.nextInt();
				System.out.println("Enter the max Value");
				max=sc.nextInt();
				/*
				for(i=min;i<=max;i++)
				{
					System.out.print(i+"\t");
				}
				*/
				while(min<=max)
				{
					System.out.println(min+"\t");
					min++;
				}
			}

		
	}


