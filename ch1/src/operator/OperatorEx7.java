package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받는다
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = Integer.parseInt(sc.nextLine());

        // 입력받은 숫자가 양수, 음인지 출력하기
        System.out.println(num > 0 ? "양수" : "음수");

    }

}
