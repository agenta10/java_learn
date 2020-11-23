import java.util.*;
class Array{
	public static void main(String[] args)
	{	int a[]=new int[5];
		int b[]={1,2,3,4,5};
		for(int i=0;i<=4;i++)
		{	a[i]=i+1;
		}
		if(Arrays.equals(a,b))
		{	System.out.println("Yes");
		}
	}
}