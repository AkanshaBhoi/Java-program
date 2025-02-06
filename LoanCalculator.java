import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the Amount: ");
		float amount=sc.nextFloat();
		System.out.println("Enter the ROI");
		float roi=sc.nextFloat();
		System.out.println("Enter the tenure(months):");
		int month=sc.nextInt();
		//con from month to year
		float con = month / 12.0f;
		/*String abc=(month/12)+" . "+(month%12);
		float con =Float.perseFloat(str);*/

		System.out.println();
		System.out.println("Loan Calculation");
		System.out.println("Peincipal Amount : "+amount);
		System.out.println("Roi :"+roi+"%");
		System.out.println("Tenure :"+month+"months");

		float intYear = amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : "+ totalInter);
		float outStanding=amount+totalInter;
		System.out.println("Total Outstanding Amount: "+(outStanding));
		System.out.println("Emi :"+(outStanding/month)+"rs");

	}
}
