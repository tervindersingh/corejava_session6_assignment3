import java.io.*;
interface Shape
{
	public void area (int a);
	public void area(int a,int b);
	public void area(int a,int b,int c);
}
class ShareArea implements Shape
{
	public void area (int a)
	{
		System.out.println("Area of Square is "+a*a);
	}
	public void area (int a,int b)
	{
		System.out.println("Area of Rectangle is "+a*b);
	}
	public void area(int a,int b, int c)
	{
		int s=a+b+c;
		float f=(float)s/2;
		double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle is "+ar);
	}
	public int draw() throws Exception
	{	int a=1;
		String str;
		try
		{
		
		System.out.println("1	Area of Square");
		System.out.println("2 	Area of Rectangle");
		System.out.println("3	Area of Triangle");
		System.out.println("Enter your choice");		
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		str=rd.readLine();
		a=Integer.parseInt(str);
		}
		catch(IOException e)
		{
	         e.printStackTrace();
		}
		return a;
	}
	public void getArea(int a) throws Exception
	{	String str;
		int l,b,p,q,r;
		try
		{
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));

			switch (a)
			{
			case 1:
			System.out.println("Enter length of Square: ");		
	
			str=rd.readLine();
			l=Integer.parseInt(str);
			area (l);
			break;
			case 2:
			System.out.println("Enter length of Rectangle: ");		
			str=rd.readLine();
			l=Integer.parseInt(str);
			System.out.println("Enter breath of Rectangle: ");		
			str=rd.readLine();
			b=Integer.parseInt(str);
			area(l,b); 	
			break;
			case 3:
			System.out.println("Enter length of first side of Triangle: ");		
			str=rd.readLine();
			p=Integer.parseInt(str);
			System.out.println("Enter length of second side of Triangle: ");		
			str=rd.readLine();
			q=Integer.parseInt(str);
			System.out.println("Enter length of third side of Triangle: ");		
			str=rd.readLine();
			r=Integer.parseInt(str);
			area(p,q,r); 	
			break;
			default:
			System.out.println("You are chosen wrong choice");
			break;
		}	
		
		}
		catch(IOException e)
		{
	         e.printStackTrace();
		}
	}		
}
public class classArea
{
	public static void main(String args[]) throws Exception
	{	
		try
		{
		ShareArea SA=new ShareArea();
		int a;
		a=SA.draw();
		SA.getArea(a);				
		}
		catch(Exception e)
		{
	         e.printStackTrace();
		}

	}
}
