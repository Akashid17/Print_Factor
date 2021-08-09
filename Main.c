
#include<stdio.h>

void Factors(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(int i = 1; i < iNo; i++)
    {
        if(iNo%i == 0)
        {
            printf("%d ",i);
        }
    }
    printf("\n");
}

int main()
{
    int iValue = 0;

    printf("Enter Number\n");
    scanf("%d",&iValue);

    Factors(iValue);

    return 0;
}