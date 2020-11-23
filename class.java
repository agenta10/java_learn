class exm{
	public static void main(String[] args)
	{	box b1=new box();
		b1.setdim(1,2,3);
		b1.showdim();
		b1=new box(); // older refrence will be deleted by garbage collector
	}
}

class box{
	private int x,y,z;
	public void setdim(int x1,int y1,int z1)
				{x=x1;y=y1;z=z1;}
	public void showdim()
	{	System.out.println(x);
		System.out.println(y);
		int x=2,y=2;
		if(x==2)
		System.out.println(z);
	}
}