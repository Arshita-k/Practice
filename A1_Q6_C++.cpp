//Print Reverse of a Number
#include<iostream>
using namespace std;
main()
{
    long num;
    int rem;
    cout<<"Please Enter the Number: ";
    cin>>num;
    while (num!=0)
    {
        rem=num%10;
        cout<<rem<<"\n";
        num/=10;
    }
    return 0;
   
}
