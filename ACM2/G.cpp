#include <iostream>
#include <algorithm>
using namespace std;

bool binarySearch(int arr[],int len,int n){
    int i=0;
    int j=len-1;
    int mid=0;
    while(i<=j){
        mid = (i+j)/2;
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
    while(cin>>n){

        int *arr1 = new int[n];

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
        bool flag= false;
        sort(arr2,arr2+n*n);
        for (int i = 0; i < n*n; ++i) {
            if(binarySearch(arr2,n*n,m-arr2[i])){
                flag=true;
                break;
            }
        }
        if(flag){
            cout<<"Yes"<<endl;
        }
        else{
            cout<<"No"<<endl;
        }

        delete []arr1;
        delete []arr2;
    }

    return 0;
}