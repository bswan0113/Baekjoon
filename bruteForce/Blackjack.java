package bruteForce;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Blackjack {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int sum = Integer.parseInt(st.nextToken());
            List<Integer> list = createBlackjackList(count,br);
            int result = createBestResult(list,sum);
            bw.write(String.valueOf(result));
            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int createBestResult(List<Integer> list, int sum) {
        int result=0;
        int closestNum=0;
        for(int i=0;i<list.size();i++){
            for(int j=0; j<list.size();j++){
                if(j==i)continue;
                for(int k=0; k<list.size();k++){
                    if(k==i || k==j)continue;
                    int total = list.get(i)+list.get(j)+list.get(k);
                    if(total>sum)continue;
                    else if(total == sum) return sum;
                    else{
                        if(sum-closestNum > sum - total){
                            closestNum=total;
                            result=total;
                        }
                    }
                }
            }
        }
        return result;
    }

    private static List<Integer> createBlackjackList(int count, BufferedReader br) throws IOException {
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }
        return list;
    }

}

