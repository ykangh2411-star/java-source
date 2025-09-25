package control;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~ 10 숫자 중 짝수 출력
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(1 + " ");
            }
        }
        System.out.println();
        for (int i = 1; i < 11; i += 2) {
            System.out.println(i + " ");
        }
        System.out.println();
        // 구구단 출력
        // 3단
        // 3 * 1 = 3
        // 3 * 2 = 6
        for (int i = 1; i < 10; i++) {
            System.out.printf("3 * %2 = %2d/n", i, (3 * 1));
        }
    }

}
