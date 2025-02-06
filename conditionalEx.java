class conditionalEx 
{
	public static void main(String[] args) 
	{
		int a=22;
		int b=10;
		int c=12;

		int lar=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(lar);

		//small of two number
		//int a=22;
		//int b=10;
		//int c=12;

		//int lar=(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		//System.out.println(small);
	}
}
