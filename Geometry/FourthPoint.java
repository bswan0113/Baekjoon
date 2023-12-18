package Geometry;

import java.io.*;
import java.util.StringTokenizer;

public class FourthPoint {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer inputPointA = new StringTokenizer(br.readLine());

            int pointAX = Integer.parseInt(inputPointA.nextToken());
            int pointAY = Integer.parseInt(inputPointA.nextToken());

            StringTokenizer inputPointB = new StringTokenizer(br.readLine());

            int pointBX = Integer.parseInt(inputPointB.nextToken());
            int pointBY = Integer.parseInt(inputPointB.nextToken());

            StringTokenizer inputPointC = new StringTokenizer(br.readLine());

            int pointCX = Integer.parseInt(inputPointC.nextToken());
            int pointCY = Integer.parseInt(inputPointC.nextToken());

            int pointDX=0;
            int pointDY=0;

            if(pointAX == pointBX)pointDX=pointCX;
            else if(pointAX==pointCX)pointDX=pointBX;
            else pointDX=pointAX;

            if(pointAY == pointBY)pointDY=pointCY;
            else if(pointAY==pointCY)pointDY=pointBY;
            else pointDY=pointAY;
            bw.write(pointDX+" "+pointDY);




            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

