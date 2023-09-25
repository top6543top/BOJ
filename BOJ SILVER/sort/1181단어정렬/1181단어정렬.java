import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        HashSet<String> a= new HashSet<String>();
        
        for(int i=0;i<n;i++){
            a.add(br.readLine());
        }//hash set을 이용해 중복처리
        ArrayList<String> b= new ArrayList<>(a); //정렬을 이용하기 위해 arraylist에 hash입력
        Collections.sort(b,(o1,o2)->{
              return o1.length()>o2.length()?1:o1.length()<o2.length()?-1:0;
            }
        );// 1이면 오름차순으로 정렬 -1이면 내림차순 정렬 0이면 정렬x
        // 길이순으로 정렬
        Collections.sort(b,(o1,o2)->{
              return o1.length()==o2.length()?
                        (o1.compareTo(o2)>0?1:-1):0;
            }
        ); // 길이가 같다면 배열을 비교해서 정렬
        for(int i=0;i<b.size();i++){
            System.out.println(b.get(i));
        }
	}
}
