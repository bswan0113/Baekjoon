package advanced;

import java.io.*;

public class Palindrome {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        boolean isPalindrome=true;
        int length = input.length();
        int count = length/2;
        char[] inputArray = input.toCharArray();
        for(int i=0; i<count; i++){
            if(inputArray[i] != inputArray[length-i-1]){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome)bw.write('1');
        else bw.write('0');
        br.close();
        bw.close();
    }
}

