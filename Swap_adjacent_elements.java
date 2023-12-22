package Arrays;

public class Swap_adjacent_elements 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5,6};
		int temp;
		for(int x=0;x<=a.length-1;x++)//0<=5,2<=5,4<=5,6<=5
		{
			temp=a[x];//1,3,5
			a[x]=a[x+1];//2,4,6
			a[x+1]=temp;//1,3,5
			System.out.print(a[x]+""+a[x+1]);//21,43,65
			x=x+1;//1,3,5
		}
	}
}
