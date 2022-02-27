#include<iostream>
using namespace std;
 bool isPow(int n)
{
    return (n&&!(n&n-1));
}
int main()
{
    int n;
    cin>>n;
    cout<<isPow(n);
    return 0;
}
