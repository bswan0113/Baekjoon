package twoDimensionalMatrix;

import java.io.*;
import java.util.StringTokenizer;

public class MatrixMaxValue {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int row =9;
            int column=9;
            int maxNum = Integer.MIN_VALUE;
            int maxRow = 0;
            int maxColumn =0;
            for(int i=0; i<column;i++){
                StringTokenizer input = new StringTokenizer(br.readLine());
                for(int j=0;j<row;j++){
                    int num = Integer.parseInt(input.nextToken());
                    if(num>maxNum){
                        maxNum=num;
                        maxColumn=i+1;
                        maxRow=j+1;
                    }
                }
            }
            bw.write("maxNum result :: "+maxNum+"\n");
            bw.write("maxColumn :: "+ maxColumn+" maxRow :: "+maxRow);
            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

