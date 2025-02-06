import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		float num1=sc.nextInt();

		System.out.println("Enter number 2:");
		float num2=sc.nextInt();

		System.out.println("Enter operator:");
		float op=sc.next().charAt(0);

		float out =(op=='+')?num1+num2:
			(op=='-')?num1-num2:
			(op=='*')?num1*num2:
			(op=='/')?num1/num2:
			(op=='%')?num1%num2:0.000001F;
		
		//System.out.println(num1+" "+op+" "+num2+" = "+out);

		String output=num1+" "+op+" "+num2+" = "+out;

		if(!(out==0.000001f))
		System.out.println(output);
	}
}
