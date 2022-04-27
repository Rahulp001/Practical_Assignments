import java.util.*;

/*	Accept the choice from the user and perform the task
	1:Greater between three no
	2: Area of rectangle
	3: Cube if no is divide by 7
	4:accept age and gender and display RI (above 60 m:7 , f:7.5) (below 60 m,f=5%)*/
public class switch_demo {

	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your choice of operation:\n 1.Greater no. \t 2. area of rectangle \n 3.cube \t 4.Rate of interest ");
		ch = sc.nextInt();
		
		switch (ch) {
		case 1: {
			   int num1,num2;
			   Scanner v = new Scanner(System.in);
				System.out.println("Enter two number ");
				num1=v.nextInt();
				num2=v.nextInt();
			   if(num1>num2) {
			   System.out.println("Greater no. between given no is "+num1);
			   }
			   else 
				   System.out.println("Greater no. between given no is "+num2);
			   break;
		}
		case 2:{
			 int l,w;
		      int area;
		       Scanner in =new Scanner(System.in);
		       System.out.println("Enter length of Rectangle");
		       l=in.nextInt();
		       System.out.println("Enter width of Rectangle");
		       w=in.nextInt();
		       area =l*w ;
		      System.out.println("Area of Rectangle: "+area);
		      break;
			
		}
		case 3:{
			int num,res;
			Scanner vc =new Scanner(System.in);
			System.out.println("Enter  a number");
			num=vc.nextInt();
			if(num%7!=0) {
				System.out.println("Invalid!Enter number divisible by 7");
			}
			else {
				res=num*num*num;
				System.out.println("the cube of given number is :"+res);
			}
			
			break;
		}
		case 4:{
			int age;
			char gen;
			Scanner g =new Scanner(System.in);
			System.out.println("Enter  a gender of customer ");
			gen=g.next().charAt(0);
			System.out.println("Enter  a age of customer ");
			age=g.nextInt();
			if(gen =='m') {
				if(age>=60) {
					System.out.println("rate of interest is 7%");		
				}
				else
					System.out.println("rate of interest is 5%");
			}
			
			else if(gen=='f') {
				if(age>=60) {
					System.out.println("rate of interest is 7.5%");	
				}
				else
					System.out.println("rate of interest is 5%");
			}
			break;
		} 
		default:
			System.out.println("Invalid! Enter correct choice");
			break;
		
		}

	}

}
