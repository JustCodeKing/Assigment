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
    int m,n;
    cin>>m>>n;
    int x=max(m,n);
    cout<<x<<" "<<(m/x)*n<<endl;
    return 0;
}