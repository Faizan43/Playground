#include<iostream>
#include<stdlib.h>
using namespace std;
int main(){
  int n;
  cin>>n;
  int i;
  int *ptr=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++){
  	cin>>ptr[i];
  }
  int even=0,odd=0;
  i=0;
  while(i<n){
  	if(ptr[i]%2==0){
    even++;
    }
    else{
    odd++;
    }
    i++;
  }
  cout<<odd<<"\n";
  cout<<even;
  // Type your code here
  return 0;
}