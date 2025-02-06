import java.util.Scanner;
class Forvol 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Username:");
		String un=sc.nextLine();
		int len=un.length();

		for(int i=0;i<len;i++)
		{
			if(un.charAt(i)=='a'||un.charAt(i)=='e'||un.charAt(i)=='i'||un.charAt(i)=='o'||un.charAt(i)=='u')
			{
			    System.out.print("Vowel in the username are:"+" "+un.charAt(i)+" ");
			}
		}
	}
}
