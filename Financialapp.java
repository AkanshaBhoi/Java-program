import java.util.Scanner;
class Financialapp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill Amount: ");
		float bill=sc.nextFloat();
		System.out.println("Enter tip rate amount %: ");
		float tiprate=sc.nextFloat();
	
		float subtotal=(bill*tiprate)/100;
		float gratudetotal=subtotal+bill;

		System.out.println("tip rate: "+subtotal);
		System.out.println("Grand total: "+gratudetotal);
	}
}
