//Print All the Prime Numbers till N
#include<iostream>
using namespace std;
main()
{
    int n1,n2,i,j;
    cout<<"Please Enter the lower limit: ";
    cin>>n1;
    cout<<"Please Enter the Upper limit: ";
    cin>>n2;
    for(i=n1;i<=n2;i++)
    {   
        int Prime_Factors=0;
        for(j=2;j*j<=i;j++)
        {
            if(i%j==0)
            {
                Prime_Factors=Prime_Factors+1;
                break;
            }
        }
        if(Prime_Factors==0)
        {
            cout<<i<<endl;
        }
    }
}
