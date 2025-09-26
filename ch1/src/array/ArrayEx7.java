package array;

import java.net.Socket;
import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        String[] strArr = { "Kim", "Park", "Yi" };
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[0].length());

        // char 배열과 String 배열
        // String : char 배열 + 기능 (메서드)

        String[] strArr2 = new String[3];
        strArr[0] = "Kim";
        strArr[1] = new String("Park");
        strArr[2] = "Yi";

        System.out.println(strArr[0]);
        System.out.println("strArr[0].charAt(0)" + strArr2[0].charAt(0));

        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            System.out.println(src.charAt(i));
        }
        // String => char 배열
        char[] chArr2 = src.toCharArray();

        char[] chArr = { 'A', 'B', 'C', 'D', 'E' };
        // char 배열 => String
        String str2 = new String(chArr);
        System.out.println(str2);

    }
}
