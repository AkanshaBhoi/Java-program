import java.util.Scanner;
class yearcalculation  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
		long min=sc.nextLong();

		long years=min/(365*24*60);
		long days=(min%(365*24*60))/(24*60);

		System.out.println(+min+"minutes is approximately"+years+"Years and"+days+"days");


	}
}
