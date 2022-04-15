//WAP to accept two no from user and find out add,sub,mul,div,mod
import java.util.*;

class calc
{
       public static void main (String args[]){
       double num1,num2;
       double res1,res2,res3,res4; 
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter First Number");
       num1=sc.nextDouble();
       System.out.println("Enter Second NSumber");
       num2=sc.nextDouble();
       res1 = num1+num2;
       System.out.println(num1+"+"+num2+"="+res1);
       res2 = num1-num2;
       System.out.println(num1+"-"+num2+"="+res2);
       res3 = num1*num2;
       System.out.println(num1+"*"+num2+"="+res3);
       res4 = num1/num2;
       System.out.println(num1+"/"+num2+"="+res4);
       
      }
}