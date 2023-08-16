import java.io.*;
import java.util.*;
class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken()); // 세로
    int M = Integer.parseInt(st.nextToken()); // 가로
    int i,j,k,l,flag1=0,flag2=0,min1=0,min2=0;
    String chess[] = new String[N];
    for(i=0;i<N;i++){
        chess[i] = br.readLine();
    }
   
    char bChess[][]=new char[8][8];
    char wChess[][]=new char[8][8];
    for(i=0;i<8;i++){
        for(j=0;j<8;j++){
            if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)){
              bChess[i][j]='B';
              wChess[i][j]='W';
            } else {
                bChess[i][j]='W';
                wChess[i][j]='B';
            }
        }
    }
    for(i=0;i<=N-8;i++){
        for(j=0;j<=M-8;j++){
            flag1=0;
            flag2=0; 
            for(k=0;k<8;k++){
                for(l=0;l<8;l++){
                    if(chess[i+k].charAt(j+l)!=bChess[k][l]){
                        flag1++;
                    }
                    if(chess[i+k].charAt(j+l)!=wChess[k][l]){
                        flag2++;
                    }
                }
            }
            if(flag1>flag2) {min1=flag2;}
            else {min1=flag1;}
            
            if(j==0&&i==0){
                min2=min1;
            }else{
                if(min2>min1){min2=min1;}
            }
        }
        
    }
    System.out.println(min2);
  }
}