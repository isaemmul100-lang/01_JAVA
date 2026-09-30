package lecture.section01.logical;

public class Application2 {

    public static void main(String[] args) {

        // && || 의 우선순위

        // 논리 연산자 중에서는 && 연산이 || 연산보다 먼저 실행된다.
        boolean result1 = true || false && false; // true
        boolean result2 = (true || false) && false; //false
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // 아래의 alpha 변수에 담긴 값이 알페벳인지 판별하는 코드를 작성하세요
        char alpha = 'f';

        boolean answer = true; // 결과값 알파벳이면 true 아니면 false가 나와야합니다

        // 조건 작성
        answer = 65 <= (int)alpha && (int)alpha <= 90 || 97 <= (int)alpha && (int)alpha <= 122;

        // 강사님 버전
        boolean isUpperCase = alpha >= 'A' && alpha <= 90;
        boolean isLowerCase = alpha >= 'a' && alpha <= 122;
        answer = isLowerCase || isUpperCase;

        System.out.println("answer = " + answer);


    }

}
