package Geometry;

import java.io.*;

public class MemorizeTriangles {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int angle1 = Integer.parseInt(br.readLine());
            int angle2 = Integer.parseInt(br.readLine());
            int angle3 = Integer.parseInt(br.readLine());
            int total = angle1+angle2+angle3;
            if(total==180){
                if(angle1==angle2 && angle2==angle3)bw.write("Equilateral");
                else if(angle1 != angle2 && angle2!= angle3 && angle3 != angle1) bw.write("Scalene");
                else bw.write("Isosceles");

            }else{
                bw.write("Error");
            }


            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

