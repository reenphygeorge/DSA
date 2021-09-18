/*
 * 
 * Title: Binary Search
 * 
 * Date: 22th August 2021
 * 
 */

#include<iostream>
using namespace std;

void lSearch(int arr[] , int n , int k)
{
    int flag=0,loc;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==k)
        {
            flag=1;
            loc=i;
            break;
        }
    }
    if(flag==1)
    {
        cout<<k<<" is found at "<<loc<<"th position in the array";
    }
    else
    {
        cout<<k<<" is not found";
    }
}
int main()
{
    int n,k;
    cout<<"Enter the size of array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter Array Elements: ";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter the value to be searched: ";
    cin>>k;
    lSearch(arr , n , k);
    return 0;
}