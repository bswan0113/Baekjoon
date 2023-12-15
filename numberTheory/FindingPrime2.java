package numberTheory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FindingPrime2 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int min = Integer.parseInt(br.readLine());
            int max = Integer.parseInt(br.readLine());
            List<Integer> primeList = new ArrayList<>();

            for(int i=0;i<=max;i++){
                if(i==1){
                    primeList.add(0);
                    continue;
                }
                if(i<min){
                    primeList.add(0);
                }else{
                    primeList.add(i);
                }
            }
           SieveOfEratosthenes(primeList,min,max);

            int sum=0;
            int minPrime=0;
            for(int i=min; i<primeList.size();i++){
                if(minPrime==0 && primeList.get(i) !=0 )minPrime=primeList.get(i);
                if(primeList.get(i) != 0){
                    sum+=primeList.get(i);
                }
            }

            if(sum==0) bw.write("-1");
            else bw.write(sum +"\n"+minPrime);

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void SieveOfEratosthenes(List<Integer> primeList, int min, int max) {
        for (int i = 2; i <= max; i++) {
            for(int j=2;j*i<=max;j++){
                primeList.set(j*i,0);
            }
        }
    }

}

