import java.util.Scanner;
class cylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Radius and hight of cylinder: ");
		double radius=sc.nextDouble();
		double hight=sc.nextDouble();

		double area=3.14*radius*radius;
		double volume=area*hight;

		System.out.println("the area is: "+area);
		System.out.println("the volume is: "+volume);
	}
}
