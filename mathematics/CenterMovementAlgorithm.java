package mathematics;

import java.io.*;

public class CenterMovementAlgorithm {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int  input = Integer.parseInt(br.readLine());
            int startCount=2;
            for(int i=0;i<input;i++){
                startCount=(increaseDotCoint(startCount));
            }
            int result= (int)Math.pow(startCount,2);
            bw.write(String.valueOf(result));
            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static int increaseDotCoint(int startCount) {
        return 2*startCount-1;
    }
}

