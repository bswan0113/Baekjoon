package Sort;

import java.io.*;
import java.util.Arrays;

public class RepresentativeValue {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] arr = new int[5];
            int sum =0;
            for(int i=0; i<5;i++){
                arr[i]=Integer.parseInt(br.readLine());
                sum+=arr[i];
            }
            Arrays.sort(arr);
            bw.write(sum/5+"\n");
            bw.write(String.valueOf(arr[2]));

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

