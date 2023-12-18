package Geometry;

import java.io.*;
import java.util.StringTokenizer;

public class EscapeFromRectangle {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer input = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(input.nextToken());
            int y = Integer.parseInt(input.nextToken());
            int w = Integer.parseInt(input.nextToken());
            int h = Integer.parseInt(input.nextToken());
            int maxNum=Integer.MAX_VALUE;
            if(maxNum>x)maxNum=x;
            if(maxNum>y)maxNum=y;
            if(maxNum>h-y)maxNum=h-y;
            if(maxNum>w-x)maxNum=w-x;
            bw.write(String.valueOf(maxNum));



            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

