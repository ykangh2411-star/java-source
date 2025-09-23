package basic;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력");
        int input = sc.nextInt();
        System.out.printf("입력값 %d", input);
        sc.close();
    }

}
