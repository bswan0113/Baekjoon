package Geometry;

import java.io.*;

public class Rectangle {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int height = Integer.parseInt(br.readLine());
            int width = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(height*width));

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

