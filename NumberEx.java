import java.util.Scanner; 
class NumberEx 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;

		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			sum+=rem;
			num/=10;
			
		
		System.out.println(sum);
		System.out.println(dup);
	}
	}
}
