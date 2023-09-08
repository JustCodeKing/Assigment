
#include <iostream>
using namespace std;

int main(){
    bool *arr=new bool[104730];
    int a[10001];
    for (int i = 0; i < 104730; ++i) {
        arr[i]=true;
    }
    arr[1]=false;
    int count=1;
    for (int i = 2; i < 104730; ++i) {
        if(arr[i]){
            a[count++]=i;

        }
        for (int j = 1; j < 10001&&i*a[j]<104730; ++j) {
            arr[i*a[j]]=false;
            if(i%a[j]==0){
                break;
            }
        }
    }
    int n;
    while(cin>>n){
        cout<<a[n]<<endl;
    }


    return 0;
}