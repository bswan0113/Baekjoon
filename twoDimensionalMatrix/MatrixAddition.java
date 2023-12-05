package twoDimensionalMatrix;

import java.io.*;
import java.util.StringTokenizer;

public class MatrixAddition {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer input = new StringTokenizer(br.readLine());
            int column = Integer.parseInt(input.nextToken());
            int row = Integer.parseInt(input.nextToken());

            int[][] matrixA = createMatrix(br, column,row);
            int[][] matrixB =createMatrix(br, column,row);

            for(int i=0; i<column;i++){
                for(int j=0; j<row;j++ ){
                    bw.write(String.valueOf(matrixA[i][j]+matrixB[i][j])+" ");
                }
                bw.write("\n");
            }
            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[][] createMatrix(BufferedReader br,int column,int row) throws IOException {
        int[][] matrix = new int[column][row];
        for(int i=0; i<column;i++){
            StringTokenizer inputAttribute = new StringTokenizer(br.readLine());
            for(int j=0; j<row;j++ ){
                matrix[i][j]=Integer.parseInt(inputAttribute.nextToken());
            }
        }
        return matrix;
    }
}

