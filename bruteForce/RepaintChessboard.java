   package bruteForce;

import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

   public class RepaintChessboard {
       public static void main(String[] args) {
           try {
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

               StringTokenizer cr = new StringTokenizer(br.readLine());

               int column = Integer.parseInt(cr.nextToken());
               int row = Integer.parseInt(cr.nextToken());
               String[][] chessBoard = new String[column][row];

               for (int i = 0; i < column; i++) {
                   String chessPieces = br.readLine();
                   for (int j = 0; j < row; j++) {
                       chessBoard[i][j] = String.valueOf(chessPieces.charAt(j));
                   }
               }

               int result = checkChessboard(column, row, chessBoard);
                bw.write(String.valueOf(result));
               br.close();
               bw.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }

       private static int checkChessboard(int column, int row, String[][] chessBoard) {
           int result = Integer.MAX_VALUE;
           for (int i = 0; i < column - 7; i++) {
               for (int j = 0; j < row - 7; j++) {
                   int paintingCount = paintingCount(i, j, chessBoard);
                   if (result > paintingCount){
                       result = paintingCount;
                   }
               }
           }

           return result;
       }

       private static int paintingCount(int startCol, int startRow, String[][] chessBoard) {
           int result1 = 0;
           int result2 = 0;
           String startPiece = chessBoard[startCol][startRow];
           int sumStartRowCol=(startCol+startRow)%2;
           for (int i = startCol; i < startCol + 8; i++) {
               for (int j = startRow; j < startRow + 8; j++) {
                   int sumRowCol=(i+j)%2;
                   if(sumRowCol==sumStartRowCol){
                       if(!startPiece.equals(chessBoard[i][j]))result1++;
                       if(startPiece.equals(chessBoard[i][j]))result2++;
                   }else{
                       if(startPiece.equals(chessBoard[i][j]))result1++;
                       if(!startPiece.equals(chessBoard[i][j]))result2++;
                   }
               }
           }
           return Math.min(result1, result2);
       }

   }