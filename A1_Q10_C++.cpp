//Prime factorisation of a number
#include<iostream>
using namespace std;
main()
{
    int n1,j;
    cout<<"Please Enter the Number: ";
    cin>>n1;
    for(j=2;j*j<=n1;j++)
    {
        while(n1%j==0)
        {
            n1/=j;
            cout<<j<<"\t";   
        }
        if(n1!=1)
        {
            cout<<n1<<endl;
        }
    }
}
