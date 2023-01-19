//Find GCD and LCM
#include<iostream>
using namespace std;
main()
{
    int num1,num2,LCM,GCD;
    cout<<"Please Enter 1st Number: ";
    cin>>num1;
    cout<<"Please Enter 2nd Number: ";
    cin>>num2;
    LCM=num1;GCD=num2;
    while(LCM!=GCD)
    {
        if(LCM<GCD)
           LCM+=num1;
        else
           GCD+=num2;
    }
    cout<<"LCM OF THE GIVEN NUMBERS: "<<LCM;
    LCM=num1;GCD=num2;
     while(LCM!=GCD)
    {
        if(LCM>GCD)
           LCM-=GCD;
        else
           GCD-=LCM;
    }
    cout<<"\n GCD OF THE GIVEN NUMBERS: "<<GCD;
    return 0;
}
