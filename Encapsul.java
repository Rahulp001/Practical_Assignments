package Ecapsulation;
//WAP to accept Students name,(Private) Roll_No, Phone_No, Marks of 5 Subject , Calculate Percentage Grade (Private)

public class Encapsul {
	public static void main(String[] args) {
		Encapsul obj = new Encapsul();
		obj.calc();
	}
	private int roll_no,per;
	private char grade;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	int phone_no;
	String student_name;
	
	public void calc() 
	{
		Encapsul2 obj1= new Encapsul2();
		int [] arr=  obj1.accept();
		int i,sum=0,val1;
		for(i=0;i<5;i++) 
		{
			sum=sum+arr[i];
		}
		per=(sum*100)/500;
		System.out.println("percentage is "+per);
	}
	public void grade() 
	{
		if(per>40) 
		{
			System.out.println('p');
		}
		else
			System.out.println('f');
	}
	

}
