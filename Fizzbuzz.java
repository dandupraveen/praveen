class Fizzbuzz
{
	public static void mian(String args[])
	{
		int start=1,end=100;
		while(start<=end)
		{
			if(start%3==0&&start%5==0)
			{
				System.out.println("fizz buzz");
			}
			else if(start%5==0)
			{
				System.out.println("buzz");
			}
			else if(start%3==0)
			{
				System.out.println("buzz");
			}
			start++;
		}
	}
}