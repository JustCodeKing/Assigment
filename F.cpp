#include <iostream>
#include <algorithm>
using namespace std;

bool binarySearch(int arr[],int len,int n){
    int i=0;
    int j=len-1;
    int mid=0;
    while(i<=j){
        mid = i+(j-i)/2;
        if(arr[mid]>n){
            j=mid-1;
        }else if(arr[mid]<n){
            i=mid+1;
        }else{
            return true;
        }
    }
    return false;
}

int main(){
    int n;
    int arr1[1000];
    cin>>n;
    for (int i = 0; i < n; ++i){
        scanf("%d",&arr1[i]);
    }
    int m;
    cin>>m;
    int *arr2 = new int[n*n];
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            arr2[i*n+j]=arr1[i]+arr1[j];
        }
    }
    sort(arr2,arr2+n*n);
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            if(binarySearch(arr2,n*n,m-arr2[i*n+j])){
                cout<<"Yes"<<endl;
                return 0;
            }
        }
    }
    cout<<"No"<<endl;
    return 0;
}