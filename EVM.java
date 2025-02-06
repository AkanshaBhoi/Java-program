import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0,cng=0,ss=0,aap=0,mns=0,no=0;
		System.out.println();
		System.out.println("    WELCOME     ");
		System.out.println();
		System.out.println("Enter the population :");
		int population=sc.nextInt();

		for(int i=1;i<=population;i++)
		{
			System.out.println();
			System.out.println("*** List of Parties ***");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6.NOTA");
			System.out.println("");
			System.out.println("Enter the option : ");
			int opt=sc.nextInt();
			if(opt>=1 && opt<=6){
			if(opt==1)
			{
				bjp++;
				System.out.println("Ache din ayenge");
			}
			if(opt==2)
			{
				cng++;
				System.out.println("Bharat todo");
			}
			if(opt==3)
			{
				ss++;
				System.out.println("Hum hai Asli Sena");
			}
			if(opt==4)
			{
				aap++;
				System.out.println("Muze Azad karo");
			}
			if(opt==5)
			{
				mns++;
				System.out.println("Jai maharashta");
			}
			if(opt==6)
			{
				no++;
				System.out.println("You are an educated Person");
			}
			
		}
		if(!(opt>=1 && opt<=6))
		{
			i--;
			System.out.println("Invalid Option");
		}
	}
		
		if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=no){
			System.out.println("Bjp has won the election by"+bjp+" votes ");
		}
		if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=no){
			System.out.println("cng has won the election by"+cng+" votes ");
		}
		if(ss>=cng && ss>=bjp && ss>=aap && ss>=mns && ss>=no){
			System.out.println("ss has won the election by"+ss+" votes ");
		}
		if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=no){
			System.out.println("aap has won the election by"+aap+" votes ");
		}
		if(mns>=cng && mns>=ss && mns>aap && mns>=bjp && mns>=no){
			System.out.println("mns has won the election by"+mns+" votes ");
		}
		if(no>=cng && no>=ss && no>=aap && no>=mns && no>=bjp){
			System.out.println("no has won the election by"+no+" votes ");
		}
	}
}
