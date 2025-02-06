import java.util.Scanner;
class tax 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary per annum");
		double salary=sc.nextDouble();

		if(salary>=0&&salary<=1600000)
		{
			System.out.println("No Tax");
		}
		else if(salary>1200000 && salary<=1600000)
		{
			System.out.println("You are chargabal saving is: "+(salary*0.15)+"Rs");
		}
		else if(salary>1600000 && salary<=2000000)
		{
			System.out.println("You are chargabal saving is: "+(salary*0.2)+"Rs");
		}
		else if(salary>2000000 && salary<=2400000)
		{
			System.out.println("You are chargabal saving is: "+(salary*0.25)+"Rs");
		}
		else if(salary>2400000)
		{
			System.out.println("You charged"+(salary*3)+"Rs");
		}
		 
	}
}
