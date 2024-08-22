package codej;

import java.util.Scanner;

public class java1 
{
double p, t, r;
double si, ci;
Scanner s;
void input()
{
	s=new Scanner(System.in);
	System.out.println("Enter principal Amount");
	p=s.nextDouble();
	System.out.println("Enter no of years");
	t=s.nextDouble();
	System.out.println("Enter rate of Interest");
	r=s.nextDouble();
	
}
void compute()
{
	si=(p*t*r)/100;
	ci=p*Math.pow(1+(r/100), t);
	
}
void display()
{
	System.out.println("Simple Interest is:"+si);
	System.out.println("compound Interest is:"+ci);
}

	public static void main(String[] args) 
	{
		java1 j=new java1();
		j.input();
		j.compute();
		j.display();
		

	}

}
