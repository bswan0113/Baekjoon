package mathematics;

import java.io.*;
import java.util.StringTokenizer;

public class TheSnailWantsToGoUp {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer input = new StringTokenizer(br.readLine());

            int possibleGoUp = Integer.parseInt(input.nextToken());
            int mustGoDown = Integer.parseInt(input.nextToken());
            int moveLength = possibleGoUp-mustGoDown;
            int totalHeight = Integer.parseInt(input.nextToken())-possibleGoUp;
            bw.write(String.valueOf((int)(Math.ceil((double) totalHeight /moveLength))+1));


            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

