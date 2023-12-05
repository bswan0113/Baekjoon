package advanced;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GroupWordChecker {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String inputCount = br.readLine();
            List<String> list =new ArrayList<>();
            for(int i=0; i<Integer.parseInt(inputCount);i++){
                list.add(br.readLine());
            }
            int result = countGroupWord(list);

            bw.write(Integer.toString(result));
            bw.close();
            br.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int countGroupWord(List<String> list) {
        int count =0;
        for(String item : list){
            char[] charList = item.toCharArray();
            char prevWord =charList[0];
            List<Character> usedWord= new ArrayList<>();
            for (char c : charList) {
                if (prevWord != c) {
                    if (usedWord.contains(c)) {
                        count++;
                        break;
                    }
                    usedWord.add(prevWord);
                }
                prevWord = c;
            }
        }
        return list.size()-count;
    }
}

