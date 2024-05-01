package basiconcept;

public class ConstructorExample 
{
	public ConstructorExample()
	{
		this(23,19,20);
		System.out.println("Default  constructor");
		
	}
	public ConstructorExample(int a)
	{
		 this(6,7,8,9);
		System.out.println("one parameter  constructor");
	}
	public ConstructorExample(int p, int q)
	{  
		this(1);
		System.out.println("Two parameter constructor");
		
	}
	public ConstructorExample(int r, int s, int t)
	{
		
		System.out.println("Three parameter  constructor");
		
	}
	
	public ConstructorExample(int r, int s, int t, int u)
	{
		 this();
		System.out.println("Four parameter  constructor");
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConstructorExample obj = new ConstructorExample(1,2);

	}

}
