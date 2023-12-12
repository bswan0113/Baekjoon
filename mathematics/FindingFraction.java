package mathematics;

import java.io.*;

public class FindingFraction {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int input = Integer.parseInt(br.readLine());

            int line = 1;
            while (input > line) {
                input -= line;
                line++;
            }

            int numerator, denominator;
            if (line % 2 == 0) {
                numerator = input;
                denominator = line - input + 1;
            } else {
                numerator = line - input + 1;
                denominator = input;
            }
            bw.write(numerator+"/"+denominator);

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

