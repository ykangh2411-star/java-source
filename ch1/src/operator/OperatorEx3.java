package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        // 비교연산자 : // > < >= <= == !=
        // 비교연산자를 사용하면 true or false 로 결과값이 나온다
        // == : 같다
        // != : 같지 않다

        int a = 10;
        float f = 10.0f;
        // 연산 수행 전 피연산자의 타입을 맞춘 후 비교
        System.out.println(a == f); // true
        System.out.println(a != f); // false
        System.out.printf("'A' == 65 = %b\n", 'A' == 65); // false

    }

}
