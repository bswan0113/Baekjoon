package timeComplexity;

import java.io.*;

public class AsymptoticNotation {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String input = br.readLine();

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

