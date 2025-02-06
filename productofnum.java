import java.util.Scanner;
class productofnum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four digit Number:");
		int num=sc.nextInt();
		int rem=0;
		int product=1;

		rem=num%10;//1234 
		product=product*rem;
		System.out.println(product);

		num=num/10;
		rem=num%10;
		product=product*rem;
		System.out.println(product);

		num=num/10;
		rem=num%10;
		product=product*rem;
		System.out.println(product);

		num=num/10;
		rem=num%10;
		product=product*rem;
		System.out.println(product);

		num=num/10;
		rem=num%10;
		product=product*rem;
		System.out.println(product);

	}
}
