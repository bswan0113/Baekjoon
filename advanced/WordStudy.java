package advanced;

import java.io.*;
import java.util.*;

public class WordStudy {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String input = br.readLine();

            char result = selectMostUsedWord(input);

            bw.write(result);
            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static char selectMostUsedWord(String input) {
        char [] arr = input.toUpperCase().toCharArray();
        List<Character> list = new ArrayList<>();
        List<Integer> listCount = new ArrayList<>();

        for(Character c : arr){
            if(!list.contains(c)){
                list.add(c);
                listCount.add(0);
            } else{
                int index = list.indexOf(c);
                listCount.set(index,listCount.get(index)+1);
            }
        }
        int maxCount = Collections.max(listCount);
        boolean isDuplicated = listCount.indexOf(maxCount) != listCount.lastIndexOf(maxCount);
        if(isDuplicated) return'?';
        else return list.get(listCount.indexOf(maxCount));
    }
}

