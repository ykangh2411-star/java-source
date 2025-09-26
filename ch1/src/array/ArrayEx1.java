package array;

// 배열 (array)
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
// 타입 배열명[ ] = new 타입[10];  배열 선언과 생성
// 타입[ ] 배열명 = new 타입[10];  배열 선언과 생성

public class ArrayEx1 {
    public static void main(String[] args) {
        // 시험점수 저장
        // 10명
        // int score1 = 0, score2 = 0, score3 = 0;
        // int sum = score1 + score2 + score3;
        // double avg = (double)sum / 10;

        // 타입 : 기본형(int, long, double, boolean, char), 참조형(String...)
        // 정수형 : 0
        int[] shit1 = new int[10];
        System.out.println(shit1[3]);
        // 실수형 : 0.0
        double[] shit2 = new double[5];
        System.out.println(shit2[0]);
        // 논리형 : false
        boolean[] shit3 = new boolean[3];
        System.out.println(shit3[1]);
        // 문자형 : 비어있음
        char[] shit4 = new char[3];
        System.out.println(shit4[8] + "shit");

        int[] shit5; // 배열 선언
        shit5 = new int[3]; // 배열 생성

        // 초기화
        // 배열 선언, 생성 초기화
        int score[] = { 88, 90, 87, 86, 77, 78, 79, 75, 72, 66 };
        int shit = 0;
        for (int i = 0; i < score.length; i++) {
            shit += score[i];
        }
        System.out.println("총합 :" + shit);
        System.out.println("평균" + shit / score.length);

    }

}
