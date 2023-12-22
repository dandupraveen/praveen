class Palindrome
{
	public static void main(String args[])
	{
		int num=355,rem=0,rev=0,temp=num;
		while(num>0)				//151>0,15>0,1>0
		{
			rem=num%10;			//151%10=1,15%10=5,1%10=1
			rev=rev*10+rem;			//0*10+1=1,1*10+5=15,15*10+1=151
			num=num/10;			//151/10=15,15/10=1,1/10
		}
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	
		//System.out.println(sum);
	}
}