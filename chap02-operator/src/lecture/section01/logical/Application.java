package lecture.section01.logical;

public class Application {

    public static void main(String[] args) {

        /*
        논리연산자
        -> 논리값을 다루는 연산자 (true or false)
        && : 두 조건이 모두 true 때만 true (and 연산)
        || : 두 조건 중 하나라도 true이면 true (or 연산)
        !  : 논리값을 반대로 변경 (not 연산)
         */

        System.out.println("true와 true의 논리 and 연산 : " + (true && true)); // true
        System.out.println("true와 false의 논리 and 연산 : " + (true && false)); // false

        System.out.println("true와 true의 논리 or 연산 : " + (true || true)); // true
        System.out.println("true와 false의 논리 or 연산 : " + (true || false)); // true

        System.out.println("========================================================");

        //성인이면서 티켓이 있는가?
        int age = 15;
        boolean hasTicket = true;

        boolean result = (age >= 20) && hasTicket;
        System.out.println("성인이면서 티켓이 있는가? : " + result);


        System.out.println("========================================================");
        //평균 80점 이상, 출석률 90% 이상, 징계이력이 없어야 장학금 대상
        //아래의 조건의 학생은 장학금 대상인가?
        int averageScore = 88; // 평균 점수
        int attendanceRate = 95; // 출석률
        boolean hasRecord = false; // 징계이력

        boolean result2 = (averageScore >= 80) && (attendanceRate >= 90) && !hasRecord;
        System.out.println("장학금 대상이 맞는가? : " + result2);
    }

}
