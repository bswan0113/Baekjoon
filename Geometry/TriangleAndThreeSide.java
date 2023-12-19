package Geometry;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TriangleAndThreeSide {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            while(true){
                StringTokenizer input = new StringTokenizer(br.readLine());
                int sideA = Integer.parseInt(input.nextToken());
                int sideB = Integer.parseInt(input.nextToken());
                int sideC = Integer.parseInt(input.nextToken());
                if(sideA==0 && sideB==0 && sideC ==0) break;
                boolean isTriangle= sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB;

                List<String> result = new ArrayList<>();
                if(isTriangle){
                    if(sideA == sideB && sideB == sideC) result.add("Equilateral");
                    else if(sideA!=sideB && sideB!=sideC && sideC != sideA)result.add("Scalene");
                    else result.add("Isosceles");
                }else{
                    result.add("Invalid");
                }

                for(String r : result){
                    bw.write(r+"\n");
                }

            }

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

