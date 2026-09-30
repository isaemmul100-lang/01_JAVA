package exercise;

public class Answer1 {

    public static void main(String[] args) {

        /*
         * 문제 1. 초를 분과 초로 변환
         *
         * totalSeconds 변수에 125를 저장한다.
         * / 연산자로 분을 계산하고 % 연산자로 남은 초를 계산한다.
         * 계산한 결과는 각각 minutes와 seconds 변수에 저장한다.
         *
         * 실행 결과
         * 125초는 2분 5초입니다.
         */

        int totalSeconds = 125;
        int minute = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + "초는 " + minute + "분 " + seconds + "초입니다.");

    }

}
