#include <iostream>
using namespace std;
int max(int m,int n){
    int r;
    while (true){
        r=m%n;
        if(r==0){
            return n;
        }else{
            m=n;
            n=r;
        }
    }
}
int main(){
    int n;
    cin>>n;
    for (int i = 0; i < n; ++i){
        int m,r;
        cin>>m;
        for (int j = 0; j < m; ++j){
            int x;
            cin>>x;
            if(j==0){
                r=max(x,x);
            }else{
                r=max(x,r);
            }
        }
        cout<<r<<endl;
    }
    return 0;
}