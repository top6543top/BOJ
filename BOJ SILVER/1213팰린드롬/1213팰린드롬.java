import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =  sc.next();
        char result[] = new char [name.length()+1];
        char dp[] = name.toCharArray(); // name을 배열로 변경
        Arrays.sort(dp); // 오름차순으로 문자열 변경
        int k=0;
        int count = 0;
       
       for(int i=0;i<=name.length();i++){
           result[i] = ' ';
       }
       
        for(int i = 0; i < name.length()-1;i++){
            if(dp[i] == dp[i+1]){
                count++;
                i++;
            }
        } // 같은게 서로 몇쌍 있는지 확인
        
        if(count == name.length() / 2){ // 펠리드롬이 될 조건
            for(int i = 0; i < name.length();i++){
                if(name.length() == 1){
                    result[0] = dp[i];
                    break;
                } // 만약 문자열이 하나글자면 두개롤 출력하기 위해
                if(i == 0 && dp[i] != dp[i+1]){
                    result[name.length() / 2] = dp[i];
                } // 첫번째 글짜 부터 다르면 가운데에 넣기
                if(i == name.length()-1){
                    result[name.length() / 2] = dp[i];
                    break;
                } // 마지막 글자가 남는다면 가운데에 넣기
                
                if(dp[i] == dp[i+1]){ // 오름차순으로 정렬되어 있으므로 바로 옆에꺼 조사
                    result[k]=dp[i]; // 다른 배열에 넣어서 펠리드롬 만들기
                    result[name.length()-1-k] = dp[i+1];
                    k++;
                    i++;
                } else {
                    result[name.length() / 2] = dp[i];
                } // 만약 다르다면 문자열 가운데에 넣기
            }
            System.out.println(result);
        } else {
            System.out.println("I'm Sorry Hansoo");
        }
	}
}
