#include <iostream>
using namespace std;

int main(){
    int n;
    int arr[50];
    cin>>n;
    for (int i = 0; i < n; ++i){
        cin>>arr[i];
    }
    int m;
    cin>>m;
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            for (int k = 0; k < n; ++k) {
                for (int l = 0; l < n; ++l) {
                    if(arr[i]+arr[j]+arr[k]+arr[l]==m){
                        cout<<"Yes"<<endl;
                        return 0;
                    }
                }
            }
        }
    }
    cout<<"No"<<endl;
    return 0;
}