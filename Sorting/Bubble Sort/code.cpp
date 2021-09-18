/*
 * 
 * Title: Selection Sort
 * 
 * Date: 30th August 2021
 * 
 */
#include<iostream>
using namespace std;

void bSort(int n , int arr[])
{
    for(int i=0 ; i<n ; i++)
    {
        for(int j=0 ; j<=n-i ; j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
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
    bSort(n , arr);
    return 0;
}