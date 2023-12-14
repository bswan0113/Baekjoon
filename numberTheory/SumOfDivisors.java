package numberTheory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SumOfDivisors {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            List<divisorInfo> list= new ArrayList<>();
            while(true){
                int input = Integer.parseInt(br.readLine());
                if(input==-1)break;
                list.add(new divisorInfo(input));
            }

            for(divisorInfo item : list){
                if(item.getNumber()!=item.getSumOfDivisors()){
                    bw.write(item.getNumber()+" is NOT perfect.\n");
                }else{
                    bw.write(item.getNumber() + " = " + item.getDivisors()+"\n");
                }
            }


            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class divisorInfo{
    int number;
    String divisors;
    int sumOfDivisors;

    public divisorInfo(int number) {
        this.number = number;
        findDivisors(number);
    }
    private void findDivisors(int number) {
        int sum=0;
        String divisors="";
        for(int i=number; i>1;i--) {
            if (number % i == 0) {
                divisors= divisors+(number/i)+" + ";
                sum +=number/i;
            }
        }
        this.divisors=divisors.substring(0,divisors.length()-2);
        this.sumOfDivisors=sum;
    }
    public int getNumber() {
        return number;
    }

    public String getDivisors() {
        return divisors;
    }

    public int getSumOfDivisors() {
        return sumOfDivisors;
    }
}

