import java.util.Scanner;
class  Addittion
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int firstnumber=sc.nextInt();
		System.out.println("enter number");
		int secondnumber=sc.nextInt();
		int run=firstnumber+secondnumber;
		System.out.println("addittion of" + firstnumber + "and" + secondnumber + "is:" + run);
	}
}
