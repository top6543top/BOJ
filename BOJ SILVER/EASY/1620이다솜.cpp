#include <iostream>
#include <string>
#include <map>

using namespace std;

map<int,string> table1;
map<string,int> table2;
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    string problem;
    int N,M,num=1;
    int j,change; string a; string b;
   
    cin >> N >> M;
    for(int i=0;i<N;i++){
       cin >> b;
       table1.insert({num,b});
       table2.insert({b,num});
       num++;
    }
    for(int i=0;i<M;i++){
        cin >> problem;
        if(isdigit(problem[0])){
            change = stoi(problem);
            cout << table1[change] << "\n";
        } else {
            cout << table2[problem] << "\n";
        }
    }
    return 0;
}
