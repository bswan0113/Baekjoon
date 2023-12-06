package twoDimensionalMatrix;

import java.io.*;
import java.util.StringTokenizer;

public class MatrixOrderByRow {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int column = 5;
            int maxRow = 15;
            char[][] matrix=new char[column][maxRow];

            for(int i=0;i<column;i++){
                String input = br.readLine();
                char[] arr =input.toCharArray();
                System.arraycopy(arr, 0, matrix[i], 0, arr.length);
            }

            for(int j=0; j<maxRow;j++){
                for(int i=0; i<column;i++){
                    if(matrix[i][j]!='\0')bw.write(matrix[i][j]);
                }
            }


            bw.close();
            br.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

