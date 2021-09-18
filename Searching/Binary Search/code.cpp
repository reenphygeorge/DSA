/*
 * 
 * Title: Binary Search
 * 
 * Date: 30th August 2021
 * 
 */

#include<iostream>
using namespace std;

int bSearch(int arr[] , int n , int k)
{
    int start = 0 , end = n-1;
    while(start <= end)
    {
        int mid = (start + end) / 2;
        if(arr[mid] == k)
        {
            return mid;
        }
        else if(arr[mid] < k)
        {
            start = mid + 1;
        }
        else
        {
            end = mid -1;
        }
    }
    return -1;
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
    int loc = bSearch(arr , n , k);
    if(loc != -1)
    {
        cout<<k<<" is found at "<<loc<<"th position";
    }
    else
    {
        cout<<k<<" is'nt found";
    }
    return 0;
}