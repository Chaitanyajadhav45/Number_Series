import java.util.Scanner;
class RecReverse
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number=sc.nextInt();
		reverse(number,0);
	}
	public static void reverse(int num, int rev)
	{
		if (num!=0)
		{
			rev=rev*10+(num%10);
			reverse(num/10,rev);
		}
		else if (num==0)
		{
		 System.out.println("After Reversing : "+rev);	
		}
		return ;
	}
}