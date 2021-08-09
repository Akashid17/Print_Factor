
using System;

class main
{
	public static void Main(string[] args)
	{
		Console.WriteLine("Enter Number");
		int iValue = Convert.ToInt32(Console.ReadLine());
		
		ArithmeticX aobj = new ArithmeticX();
		aobj.Factors(iValue);
	}
}

class ArithmeticX
{
	public void Factors(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}

		int i = 1;

		do
		{
			if(iNo % i == 0)
			{
				Console.Write(i+" ");
			}

			i++;
		}while(i < iNo);
		Console.WriteLine();
	}
}