#include<iostream>
using namespace std;
int main()
{
  int i,n,even,odd=0,arr[10];
  cin>>n;
  for(i=0;i<n;i++){
  cin>>arr[i];
  }
  i=0;
  while(i<n){
  if(arr[i]%2==0){
  even=even+arr[i];
  }
  else{
    odd=odd+arr[i];
    }
    i++;
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}