
import java.lang.*;
import java.io.*;

class Main
{
    public static void main(String args[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iValue = 0;

        try
        {
            System.out.println("Enter Number");
            iValue = Integer.parseInt(bobj.readLine());
        }
        catch(Exception eobj)
        {}

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

        while(i < iNo)
        {
            if(iNo%i == 0)
            {
                System.out.print(i+" ");
            }

            i++;
        }
        System.out.println();
    }
}