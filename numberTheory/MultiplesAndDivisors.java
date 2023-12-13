package numberTheory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MultiplesAndDivisors {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            List<String> result = new ArrayList<>();
            while(true){
                StringTokenizer input = new StringTokenizer(br.readLine());
                int numA = Integer.parseInt(input.nextToken());
                int numB = Integer.parseInt(input.nextToken());

                if(numA == 0 && numB ==0) break;
                boolean isMultiple = numA%numB == 0;
                boolean  isDivision= numB%numA == 0;
                if(isDivision){
                    result.add("factor");
                }else if(isMultiple){
                    result.add("multiple");
                }else {
                    result.add("neither");
                }
            }
            for( String s : result){
                bw.write(s+"\n");
            }


            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

