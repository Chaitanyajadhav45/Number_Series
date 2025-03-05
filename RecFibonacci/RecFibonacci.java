import java.util.Scanner;
class RecFibonacci
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter ther Number : ");
		int num=sc.nextInt();

		fibo(num,0,1);
	}
	public static void fibo(int n, int n1, int n2)
	{
		if (n>0)
		{
			int n3=n1+n2;
			System.out.println(n1);
			fibo(--n,n2,n3);
		}
		return;
	}
}