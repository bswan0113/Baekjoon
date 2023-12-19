package timeComplexity;

import java.io.*;

public class Algorithm3 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            Long n = Long.parseLong(br.readLine());
            bw.write(n*n+"\n"+"2");

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

