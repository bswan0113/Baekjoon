package Sort;

import java.io.*;

public class SortBasic {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int input = Integer.parseInt(br.readLine());
            int[] arr = new int[input];
            for(int i = 0; i<arr.length; i++ ) arr[i]=Integer.parseInt(br.readLine());

            for(int i = 0; i<arr.length; i++ ){
                for(int j=0; j<arr.length; j++){
                    if(i == j)continue;
                    else{
                        int temp1 = arr[i];
                        int temp2 = arr[j];
                        if(temp1 < temp2){
                            arr[i]=temp2;
                            arr[j]=temp1;
                        }
                    }
                }
            }
            for(int r : arr)bw.write(r+"\n");
            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

