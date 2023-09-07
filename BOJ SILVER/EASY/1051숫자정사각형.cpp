#include <iostream>
#include <string>

using namespace std;

class find_Num{
    int N,M;
    int **num;
    int max;
    string str;
public:
    void input1(){
        cin >> N >> M;
        if(N >= M) max = M;
        else max = N;
    }
    void input2(){
        for(int i = 0; i < N; i++){
            cin >> str;
            for(int j = 0;j < M;j++){
                num[i][j] = str[j] - '0';
            }
            str = "";
        }
       
    }
    int calculate(){
        int move_r;
        int move_d;
        for(int i = max; i >0;i--){
            move_r = 0;
            move_d = 0;
            while(true){
                if(is_in(move_d+i-1,move_r+i-1)){
                    if(compare(move_d,move_r,i)) {return i*i;}
                    else{
                        move_r++;
                        continue;
                    }
                }
                move_d++;
                move_r = 0;
                if(is_in(move_d+i-1,move_r+i-1)){
                    move_r = 0;
                } else {
                    break;
                }
            }
        }
        return 1;
    }
    bool compare(int a,int b,int c){
        if(num[a][b] == num[a][b+c-1] && num[a+c-1][b] == num[a][b+c-1] && num[a+c-1][b] == num[a+c-1][b+c-1]) return true;
        else return false;
    }
    bool is_in(int i,int j){
       if(i >= N || j >= M) return false;
       else return true;
    }
    void allocate(){
        num = new int*[N];
        for(int i = 0; i < N; i++){
            num[i] = new int[M];
        }
    }
    void del(){
        for(int i = 0; i < N;i++){
            delete[] num[i];
        }
        delete[] num;
    }
};

int main()
{  
    int re=0;
    find_Num f;
    f.input1();
    f.allocate();
    f.input2();
    re = f.calculate();
    cout << re << endl;
    f.del();

    return 0;
