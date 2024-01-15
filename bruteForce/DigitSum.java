package bruteForce;

import java.io.*;

public class DigitSum {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int digitSum = Integer.parseInt(br.readLine());
            int result = isDigitSum(digitSum);
            bw.write(String.valueOf(result));
            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int isDigitSum(int digitSum) {
        for(int i=1; i<=digitSum;i++){
            int findDigitSum = findDigitSum(i);
            if(findDigitSum==digitSum){
                return i;
            }
        }
        return 0;
    }

    private static int findDigitSum(int constructor) {
        int digitSum = constructor;
        while (constructor > 0) {
            digitSum += constructor % 10;
            constructor /= 10;
        }
        return digitSum;
    }
}

