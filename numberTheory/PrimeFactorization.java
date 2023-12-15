package numberTheory;

import java.io.*;

public class PrimeFactorization {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int input =Integer.parseInt(br.readLine());
            if(input!=1){
                do {
                    for (int i = 2; i <= input; i++) {
                        if (input % i == 0) {
                            input /= i;
                            bw.write(i + "\n");
                            break;
                        }
                    }
                } while (input != 1);
            }

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

