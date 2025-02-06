import java.util.Scanner;
class kilogram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double pounds=sc.nextDouble();
		
		double kilogram=pounds*0.454;

		System.out.println("Enter a number of pounds:"+pounds+"is"+kilogram+"kilogram");
	}
}
