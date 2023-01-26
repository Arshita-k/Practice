#include <iostream>
using namespace std;
int main()
{
    int n,l=0;
    cout<<"Please Enter Number of Rows: ";
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=l;j++)
            cout<<"  ";
        for(int k=1;k<=n-i+1;k++) 
            cout<<"* ";
        
        cout<<endl;
        l++;
    
    }
    return 0;
}
