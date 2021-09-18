/*
 * 
 * Title: Selection Sort
 * 
 * Date: 30th August 2021
 * 
 */

#include<iostream>
using namespace std;

void iSort(int n , int arr[])
{
    for(int i=1 ; i<n ; i++)
    {
        for(int j=i-1 ; j>=0 ; j--)
        {
            if(arr[j] > arr[])
        }
    }
    return 0;
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
    iSort(n , arr);
    return 0;
}