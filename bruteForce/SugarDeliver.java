package bruteForce;

import java.io.*;

public class SugarDeliver {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int input = Integer.parseInt(br.readLine());
            int result = -1;

            for (int i = 0; i <= input / 5; i++) {
                int remaining = input - (i * 5);
                if (remaining % 3 == 0) {
                    result = i + (remaining / 3);
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

