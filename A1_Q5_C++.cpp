//Count Digits of a number
#include<iostream>
using namespace std;
main()
{
    long num,count=0;
    cout<<"Please Enter the Number: ";
    cin>>num;
    do
    {
        num/=10;
        count++;
    } while (num!=0);
    cout<<"Number of digits:  "<<count;
}
