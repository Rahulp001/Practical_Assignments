
public class prime_1to1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=1000;
      for(int i=1;i<=a;i++) {
    	  int temp=0;
          for(int j=2;j<=i/2;j++) {
        	  if(i%j==0) {
        		  temp=1;
        		  break;
        	  }}
        	  if(temp==0) {
        		  System.out.print(i+" ");
          
        	  }
        	  
          
	}

}
}