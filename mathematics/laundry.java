package mathematics;

import java.io.*;

public class laundry {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int row = Integer.parseInt(br.readLine());

            final int penny = 1;
            final int quarter = 25*penny;
            final int dime = 10*penny;
            final int nickel = 5*penny;

            int[][] result = new int[row][4];

            for(int i=0; i<row;i++){
                int changeMoney = Integer.parseInt(br.readLine());
                result[i][0]=changeMoney/quarter;
                changeMoney=changeMoney%quarter;
                result[i][1]=changeMoney/dime;
                changeMoney=changeMoney%dime;
                result[i][2]=changeMoney/nickel;
                changeMoney=changeMoney%nickel;
                result[i][3]=changeMoney/penny;
            }
            for(int i=0; i<row;i++){
                for(int j=0;j<4;j++){
                    bw.write(result[i][j]+ " ");
                }
                bw.write("\n");
            }
            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

