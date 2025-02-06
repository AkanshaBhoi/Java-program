import java.util.Scanner;
class Fahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the degree in celcius:");
		double celsius=sc.nextDouble();

		double fahrenheit=(9.0/5)*celsius+32;

		System.out.println(celsius+"Celsius is"+fahrenheit+"Fahrenheit");
	}
}
