package numberTheory;

import java.io.*;
import java.util.StringTokenizer;

public class FindDivisors {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer input = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(input.nextToken());
            int xTh = Integer.parseInt(input.nextToken());
            int result = 0;
            for(int i=num, numeratorCount=0; i>=1 || numeratorCount==xTh; i--){
                boolean isNumeratorZero = num%i ==0;
                if(isNumeratorZero){
                    numeratorCount++;
                }
                if(numeratorCount==xTh){
                    result=num/i;
                    break;
                }
            }
            bw.write(String.valueOf(result));

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

