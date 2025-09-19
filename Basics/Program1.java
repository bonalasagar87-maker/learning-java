class Prog1
{
	public static void main(String args[])
	{
		int a,b,c;
		double average;
		System.out.print("enter C marks:");
		a=Integer.parseInt(System.console().readLine());
		System.out.print("enter JAVA marks:");
		b=Integer.parseInt(System.console().readLine());
		System.out.print("enter PYTHON marks:");
		c=Integer.parseInt(System.console().readLine());
		System.out.println("Total marks are:"+(a+b+c));
		average=(a+b+c)/3.0;
		System.out.print("Average marks are:"+average);
		if(average>60)
		{
			System.out.print("You got A grade");
		}
		else if(average>50)
		{
			System.out.print("You got B grade");
		}
		else if(average>40)
		{
			System.out.print("You got C grade");
		}
		else
		{
			System.out.print("You are FAIL");
		}
	}
}