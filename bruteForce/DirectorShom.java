package bruteForce;

import java.io.*;

public class DirectorShom {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int number = Integer.parseInt(br.readLine());
            int count=0;
            int doomsday = 666;
            while (true) {
                if (String.valueOf(doomsday).contains("666")) {  // 숫자에 "666"이 포함되어 있는지 확인
                    count++;
                }

                if (count == number) {  // 원하는 N번째 종말의 숫자를 찾았을 때
                    System.out.println(doomsday);
                    break;
                }

                doomsday++;  // 다음 숫자로 이동
            }

            br.close();
            bw.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

