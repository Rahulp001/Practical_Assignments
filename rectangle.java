//WAP to accept l & B from user and calculate AR and PR
import java.util.*;

class rectangle
{ 
     public static void main (String args[]){
      int l,w;
      int area,perimeter;
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter length of Rectangle");
       l=sc.nextInt();
       System.out.println("Enter width of Rectangle");
       w=sc.nextInt();
       area =l*w ;
      System.out.println("Area of Rectangle: "+area);
      perimeter=2*(l+w);
      System.out.println("Perimeter of Rectangle: "+perimeter);

       
     } 
}