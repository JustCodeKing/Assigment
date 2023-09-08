#include <iostream>
#include <algorithm>
using namespace std;
class HongBao{
public:
    HongBao(){
        money=0;
        count=0;
    }
    int id;
    int money;
    int count;
};
bool cmp(HongBao& s1, HongBao& s2)
{

    if(s1.money!=s2.money){
        return s1.money>s2.money;
    }
    if(s1.count!=s2.count){
        return s1.count>s2.count;
    }
    return s1.id<s2.id;

}
int main(){

    int N;
    cin>>N;
    HongBao *arr=new HongBao[N];
    for (int i = 0; i < N; ++i) {
        int k;
        cin>>k;
        arr[i].id=i;
        for (int j = 0; j < k; ++j) {
            int n,p;
            scanf("%d%d",&n,&p);
            arr[n-1].money+=p;
            arr[n-1].count++;
            arr[i].money-=p;
        }
    }



    sort(arr,arr+N, cmp);
    for (int i = 0; i < N; ++i) {
        printf("%d %.2lf\n",arr[i].id+1,arr[i].money/100.0);
    }
    return 0;
}