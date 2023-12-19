package Geometry;

import java.io.*;
import java.util.StringTokenizer;

public class Landscape {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int input = Integer.parseInt(br.readLine());

            int minX= Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            for(int i=0; i<input;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int inputX = Integer.parseInt(st.nextToken());
                int inputY = Integer.parseInt(st.nextToken());
                if(minX>inputX)minX=inputX;
                if(inputX>maxX)maxX=inputX;
                if(minY>inputY)minY=inputY;
                if(inputY>maxY)maxY=inputY;
            }
            int result =(maxX-minX)*(maxY-minY);
            bw.write(String.valueOf(result));

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

