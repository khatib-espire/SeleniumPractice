package basiconcept;

public class Javabasicconcept 
{
   // value printing through  constructor 
	int a,b,c,d,e;
	
	public Javabasicconcept(int p, int q,int r, int s, int t )
	{		
		a= p; 
		b= q;
		c= r;
		d= s;
		e= t;
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//System.out.println(" shortcut to print the method SYSO + contol +Spac ");		
		Javabasicconcept obj = new Javabasicconcept(1, 2, 3, 4, 5);
		System.out.println("value of variable a is "+obj.a);
		System.out.println("value of variable b is "+obj.b);
		System.out.println("value of variable c is "+obj.c);
		System.out.println("value of variable d is "+obj.d);
		System.out.println("value of variable e is "+obj.e);		
	}
}
