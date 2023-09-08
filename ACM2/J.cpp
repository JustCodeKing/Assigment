
#include <iostream>
using namespace std;


int main(){
    long long arr[101];
    arr[0]=1;
    arr[1]=1;
    arr[2]=2;
    for (int i = 3; i <= 100; ++i) {
        arr[i]= (arr[i-1]+arr[i-2]+arr[i-3])%(long long)(1e9 + 7);
    }
    int n;
    while(cin>>n){
        cout<<arr[n]<<endl;
    }
    return 0;
}