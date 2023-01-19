//Print Inverse of a number
#include<iostream>
#include<math.h>
using namespace std;
main()
{
    long n1,n2=0,num;
    int i=1,Rem;
    cout<<"Please Enter the Number: ";
    cin>>n1;
    while(n1!=0)
    {
      Rem=n1%10;
      n1/=10;
      n2+=i*pow(10,Rem-1);
      i++;
    }
    cout<<n2<<endl;
}
