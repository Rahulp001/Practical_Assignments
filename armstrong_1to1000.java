//WAP to display armstrongno between 1 to 1000
public class armstrong_1to1000 {
	
	public static void main(String[] args){
		int r,s=0, a;
		for(int i=1;i<=1000;i++) {
		a =i;
		s=0;
		while(a>0){
			 r=a%10;
			s=s+r*r*r;
			a=a/10;
		}
		if(i==s) 
		{
			System.out.println(i);
		}
		
		}
	
	}
}
