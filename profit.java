//WAP to accept SP and CP from user and display the result 
import java.util.*;

class profit 
{
       public static void main (String args[]){
       int sp,cp;
       int gain,loss; 
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter cost price");
       cp=sc.nextInt();
       System.out.println("Enter Selling price");
       sp=sc.nextInt();
       if(sp>cp){
         gain=sp-cp;
         System.out.println("profit is :"+gain);
       }
       else
       {
         loss=cp-sp;
         System.out.println("loss is :"+loss);
       }
}
}