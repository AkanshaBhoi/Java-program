import java.util.Scanner;
class primeno2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		String lg=((num%2==0)&&(num%5==0))?("hi five hi two"):((num%2==0)?("hi two"):((num%5==0)?("hi five"):("blank")));

		System.out.println(lg);//pandig
	}
}

//((num%2==0)?("hi two"):((num%5==0)?("hi five"):("blank")))?((num%2==0)&&(num%5==0)):("hi five hi two"));

//((num%2==0)&&(num%5==0))?("hi five hi two"):((num%2==0)?("hi two"):((num%5==0)?("hi five"):("blank")));