package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        // + - * / %
        // %d %f
        // %% = %

        int a = 10, b = 4;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b); // 나누기 연산은 몫 나옴 2
        System.out.printf("%d %% %d = %d\n", a, b, a % b); // 나머지 나옴 2
        System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b); // 2.5

        // 서로 다른 타입의 연산결과는 큰 타입을 따라간다.
        // int / int -> int
        // int / float -> float
        // int / double -> double

        char c1 = 'a', c2 = c1, c3 = ' ';

        // 1 사용시 기본타입이 int 로 인식
        // char + int => int
        c3 = (char) (c1 + 1);
        int i = c1 + 1; // char, short, byte 연산 시 자동으로 int로 변환됨
        c2++; // 'a' + 1
        System.out.println("i = " + 1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        for (char j = 'a'; j <= 'z'; j++) {
            System.out.println(j + " ");
        }

    }

}
