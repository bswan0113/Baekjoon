package advanced;

import java.io.*;
import java.util.*;

public class YourGrade {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int subjectCount=20;
            List<String> inputList = new ArrayList<>();
            for(int i=0; i<subjectCount; i++){
                inputList.add(br.readLine());
            }

            double majorRating=calculateMajorRating(inputList);
            bw.write(String.valueOf(majorRating));
            bw.close();
            br.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static double calculateMajorRating(List<String> inputList) {
        double majorRating = 0D;
        double subjectRatingTotal = 0D;
        double subjectGradeTotal = 0D;
        Map<String,Double> map = new HashMap<>();
        String[] gradeNameList ={"A+","A0","B+","B0","C+","C0","D+","D0","F"};
        int firstGrade=45;
        for(int i=0; i<gradeNameList.length;i++){
            if(i+1 == gradeNameList.length){
                map.put("F",0.0);
            }else{
                map.put(gradeNameList[i],(firstGrade/10.0));
                firstGrade-=5;
            }
        }
        for(String input : inputList){
            if(!input.split("\\s")[2].equals("P")){
                double grade = Double.parseDouble(input.split("\\s")[1]);
                double rating = map.get(input.split("\\s")[2]);
                subjectGradeTotal+=grade;
                subjectRatingTotal+=grade*rating;
            }
        }
        majorRating=subjectRatingTotal/subjectGradeTotal;

        return majorRating;
    }
}

