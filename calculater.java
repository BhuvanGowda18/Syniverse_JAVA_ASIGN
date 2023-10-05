import java.util.Scanner;
public class calculater {
	public static void add(int a,int b)
	{
		System.out.print(a+b);
	}
	public static void sub(int a,int b)
	{
		System.out.print(a-b);
	}
	public static void mul(int a,int b)
	{
		System.out.print(a*b);
	}
	public static void div(int a,int b)
	{
		System.out.print(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in); 
			System.out.println("enter the num 1");
			int num1=obj.nextInt();
			System.out.println("enter the num 2");
			int num2=obj.nextInt();
			System.out.println("enter the operation=+,-,*,/");
			String cal=obj.next();
			if (cal.equals("+"))
				{
				add(num1,num2);		
				}
			else if (cal.equals("-"))
			{
			sub(num1,num2);		
			}
			else if (cal.equals("*"))
			{
			mul(num1,num2);		
			}
			else if (cal.equals("/"))
			{
			div(num1,num2);		
			}
			else
			{
			System.out.println("invalid entry");
			}
			
		}

	}


