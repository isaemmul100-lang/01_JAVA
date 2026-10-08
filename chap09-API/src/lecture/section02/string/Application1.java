package lecture.section02.string;

import java.util.Locale;

public class Application1 {

    public static void main(String[] args) {

        // String에서 자주 쓰는 메소드
        String text = "  Java Programing  ";

        // 조회
        System.out.println("길이 : " + text.length());
        System.out.println("첫 글자 ; " + text.charAt(2)); // J

        // 검색
        System.out.println("Java 포함 : " + text.contains("Java")); // true
        System.out.println("Java 시작위치 : " + text.indexOf("Java")); // 2

        // 변환
        String trimmed = text.strip(); // "Java Programing"
        System.out.println("공백 제거 : #" + trimmed + "#");
        System.out.println("부분 문자열 : " + trimmed.substring(1, 5)); // (시작인덱스, 끝인덱스)
        System.out.println("문자열 교체 : " + trimmed.replace("Java", "Kotlin"));
        System.out.println("대/소문자 변환 : " + trimmed.toUpperCase());

    }
}
