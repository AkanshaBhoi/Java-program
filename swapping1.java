class swapping1 
{  
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;

		System.out.println("After Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
			
		int temp=a; //logic using temp variable
		a=b;
		b=temp;

		System.out.println("Before Swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);


	}
}
