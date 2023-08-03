#include <iostream>

using namespace std;
class Cabbage{
    int weight;
    int height;
    int cab;
    int **loc;
    int warm = 0;
    int flag = 0;
public:  
    void input1_Function(){
        cin >> weight >> height >> cab;
    }
   
    void input2_Function(){
        int l,m; // l이 가로 m이 세로
        for(int i = 0;i<height;i++){
            for(int j = 0;j<weight;j++){
                loc[i][j] = 0;
            }
        }
        for(int i = 0;i<cab;i++){
            cin >> l >> m;
            loc[m][l] = 1;
        }
    }
   
    void need_Warm(){
        for(int i = 0;i<height;i++){
            for(int j = 0;j<weight;j++){
                try{
                    if(loc[height][weight] == 1 && flag == 0){
                        warm++;
                        flag = 1;
                    }
                }catch(out_of_range& e){
                    continue;
                }
            }
        }
    }
   
    void insert_container(){
        loc = new int* [height];
        for(int i = 0;i<height;i++){
            loc[i] = new int [weight];
        }
    }
    void delete_container(){
        for(int i=0; i<height; i++){
        	delete[] loc[i];
        }
        delete[] loc;
    }
};
int main()
{
   
    Cabbage c;
    int a;
   
    cin >> a;
    for(int i = 0;i < a;i++){
        c.input1_Function();
        c.insert_container();
        c.input2_Function();
        c.need_Warm();
        c.delete_container();
    }
   
    return 0;
}