package loop;

public class patern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}	
			for(int j=1;j<2*i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}

