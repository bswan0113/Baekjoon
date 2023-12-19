package Geometry;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ThreePole {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer input = new StringTokenizer(br.readLine());

            List<Integer> triangle =new ArrayList<>();
            triangle.add(Integer.parseInt(input.nextToken()));
            triangle.add(Integer.parseInt(input.nextToken()));
            triangle.add(Integer.parseInt(input.nextToken()));
            Collections.sort(triangle);
            int poleA = triangle.get(0);
            int poleB = triangle.get(1);
            int poleC = triangle.get(2);
            if(poleC>=poleA+poleB){
                bw.write(String.valueOf(2*(poleA+poleB)-1));
            }else{
                bw.write(String.valueOf(poleA+poleB+poleC));
            }


            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

