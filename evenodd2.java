import java.util.Scanner;
class evenodd2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();

		System.out.println(num%2==0);
	}
}
