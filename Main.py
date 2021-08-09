
def Factors(iNo):

    if iNo < 0:
        iNo = -iNo

    for x in range(1,iNo):
        if iNo%x == 0:
            print(x,end=" ")

def main():

    iValue = int(input("Enter Number\n"))

    Factors(iValue)

    print()

if __name__ == "__main__":

    main()