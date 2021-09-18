/*
 * 
 * Title: Selection Sort
 * 
 * Date: 30th August 2021
 * 
 */
#include<iostream>
using namespace std;

void sSort(int n , int arr[])
{
    for(int i=0 ; i<n-1 ; i++)
    {
        int sm = i+1;
        for(int j=i+1 ; j<n ; j++)
        {
            if(arr[j] < arr[sm])
            {
                sm = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[sm];
        arr[sm] = temp;
    }
    cout<<"Sorted Array: ";
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
    sSort(n , arr);
    return 0;
}