package mathematics;

import java.io.*;

public class HoneyComb {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int input =Integer.parseInt(br.readLine());

            int total=1;
            int path=1;
            while(input>total){
                total+=6*(1+path-1);
                path++;
            }
            bw.write(String.valueOf(path));

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

