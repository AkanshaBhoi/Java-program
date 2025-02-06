import java.util.Scanner;
class LightBill 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		int value=sc.nextInt();
		int bill;

		if(value>=0&&value<=100){
			bill=(value*5)-100;
		}
		else if(value>=100&&value<=200){
			bill=(value*7)-100;
		}
		else{
			bill=(value*10)-100;
		}
		System.out.println("Total Bill"+bill);
		
	}
}
