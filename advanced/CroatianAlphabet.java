package advanced;

import java.io.*;

public class CroatianAlphabet {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        int result = countCroatianAlphabet(input);
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
    }

    private static int countCroatianAlphabet(String input) {
        String [] croatianList= {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int count = 0;
        for (String string : croatianList){
            while(input.contains(string)){
                input = input.replaceFirst(string,".");
                count++;
            }
        }
        input = input.replace(".","");
        return  count+input.length();
    }
}

