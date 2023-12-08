package mathematics;

import java.io.*;
import java.util.StringTokenizer;

public class NotationConversion {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer input = new StringTokenizer(br.readLine());

            String num = input.nextToken();
            int decimalNum = Integer.parseInt(input.nextToken());
            int result=0;

            for(int i=num.length()-1;i>-1;i--){
                char numChar = num.charAt(i);
                int coefficient = 0;
                if('0'<=numChar && numChar<='9'){
                    coefficient=numChar-'0';
                }else if('A'<=numChar && numChar<='Z'){
                    coefficient=numChar-'A'+10;
                }
                result+=coefficient*(int)Math.pow(decimalNum,num.length()-1-i);
            }
            bw.write(String.valueOf(result));


            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

