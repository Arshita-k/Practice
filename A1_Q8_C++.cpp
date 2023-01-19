// Print a number after Rotation
#include<iostream>
#include<math.h>
using namespace std;
main()
{
    long n1,n2,num;
    int k,i=0,Q,Rem;
    cout<<"Please Enter the Number: ";
    cin>>n1;
    cout<<"Please Enter The number of Rotations: ";
    cin>>k;
    num=n1;
    while(num!=0)
    {
        num/=10;
        i++;
    }
    int division = pow(10,k);
    int multiply= pow(10,i-k);
    Q=n1/division;
    Rem=n1%division;
    n2=(Rem*multiply)+Q;
    cout<<n2<<endl; 
}
