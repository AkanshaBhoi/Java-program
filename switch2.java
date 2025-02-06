import java.util.Scanner;
class Switch2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("********WELCOME*********");
		System.out.println();
		System.out.println("Enter Season(Summer,Mansoon,Winter):  ");
		String season=sc.nextLine();
		
		switch (season)
		{
		case "Summer":
			{
				System.out.println("FEBRUARY");
				System.out.println("MARCH");
				System.out.println("APRIL");
				System.out.println("MAY");
				break;
			}
		case "Mansoon":
			{
				System.out.println("JUNE");
				System.out.println("JULLY");
				System.out.println("AUGUST");
				System.out.println("SEPTEMBER");
				break;
			}
		case "Winter":
			{
				System.out.println("OCTOBER");
				System.out.println("NOVEMBER");
				System.out.println("DECEMBER");
				System.out.println("JANUARY");
				break;
			}
		default:
			{
				System.out.println("This is not a month");
			}
		
		
		}
	}
}
