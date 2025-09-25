package basic;

//기본 타입 : byte, short, int, long, float, double, char, boolean
//창조 타입 : 기본형을 제외한 모든 타입 

public class StringEX1 {
    public static void main(String[] args) {
        // 문자열 : " " 쓰는 타입이 문자열 / " " 쓰면 무조건 String (대문자로 시작)
        String str1 = "안녕하세요";
        String str2 = "안녕하세요";

        // 문자열이 같은가? ==, !=,
        System.out.println(str1 == str2 ? "문자열이 같다" : "문자열이 다르다");

        String str3 = new String("안녕하세요");
        System.out.println(str1 == str3 ? "문자열이 같다" : "문자열이 다르다");

        // equals
        System.out.println("equals 사용");
        System.out.println(str1.equals(str3) ? "문자열이 같다" : "문자열이 다르다");
        // abe == ABC
        String str4 = "abc", str5 = "ABC";
        System.out.println(str4.equals(str5) ? "abc == ABC" : "abc != ABC");
        System.out.println(str4.equalsIgnoreCase(str5) ? "abc == ABC" : "abc != ABC");

    }
}
