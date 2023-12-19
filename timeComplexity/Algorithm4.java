package timeComplexity;

import java.io.*;

public class Algorithm4 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            Long input = Long.parseLong(br.readLine());
            bw.write((input-2) * (input-1) * input / 6+"\n"+3);

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

