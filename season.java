import java.util.Scanner;
class season 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month:");
		String month=sc.next().toUpperCase();

		String lg=(month.equals("OCT"))||(month.equals("NOV"))||(month.equals("DEC"))||(month.equals("JAN"))?month+" is winter":
			(month.equals("FAB"))||(month.equals("MAR"))||(month.equals("APR"))||(month.equals("MAY"))?month+" is summer":
			(month.equals("JUN"))||(month.equals("JUL"))||(month.equals("AUG"))||(month.equals("SEP"))?month+" is mansoon":"not a month";
		System.out.println(lg);
	}
}
