package control;

// continue : 반복문 내에서만 사용
//            반복이 진행될 때 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어감. 
public class ContinueEx1 {
    public static void main(String[] args) {
        // 1 ~ 10 사이 숫자 출력, 하지만 3의 배수는 제외
        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);

        }
    }

}
