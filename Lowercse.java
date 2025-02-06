import java.util.Scanner;
class Lowercse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabate:");
		char ch=sc.next().charAt(0);

		String op=(ch>='a' && ch<='z')?("It is an Lower case alphabate!"):("It is not lower case alphabate!");

		System.out.println(op);
	}
}
