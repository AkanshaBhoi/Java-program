import java.util.Scanner;
class Healthapp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight=sc.nextDouble();
		System.out.println("Enter height in inches: ");
		double height=sc.nextDouble();

		double kilo=weight*0.45359237;
		double meter=height*0.0254;

		double BMI=kilo/(meter*meter);

		System.out.println("BMI is"+BMI);
	}
}
