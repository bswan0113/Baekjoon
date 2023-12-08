package mathematics;

import java.util.Scanner;

public class NotationConversionReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 진법
        int B = scanner.nextInt(); // 변환할 수
        scanner.close();

        String result = convertToBaseB(N, B);
        System.out.println(result);
    }

    public static String convertToBaseB(int N, int B) {
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                sb.append((char) ('0' + remainder));
            } else {
                sb.append((char) ('A' + remainder - 10));
            }
            N /= B;
        }

        return sb.reverse().toString();
    }
}
