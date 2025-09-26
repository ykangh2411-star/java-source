package control;

// break : switch
//         자신이 포함된 가장 가까운 반복문 벗어나기
public class breakEx1 {
    public static void main(String[] args) {
        int shit = 0, i = 0;
        while (true) {
            // shit 이 100 초과 시 반복문 중지
            if (shit > 100)
                break;
            ++i;
            shit += i;
        }
        System.out.println("i = " + i);
        System.out.println("shit = " + shit);
    }

}
