package twoDimensionalMatrix;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ColorPaper {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int number = Integer.parseInt(br.readLine());
            boolean[][] whitePaper = new boolean[100][100];
            int area=0;
            for(int i=0; i<number;i++){
                StringTokenizer input = new StringTokenizer(br.readLine());
                int pointX = Integer.parseInt(input.nextToken());
                int pointY = Integer.parseInt(input.nextToken());
                for(int j=pointX; j<pointX+10;j++){
                    for(int k=pointY;k<pointY+10;k++){
                        if(!whitePaper[j][k]){
                            area++;
                            whitePaper[j][k]=true;
                        }
                    }
                }
            }
            bw.write(String.valueOf(area));


            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

