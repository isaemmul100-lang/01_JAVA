package lecture.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {

        ExceptionTest et = new ExceptionTest();

        /*
        * 예외의 처리 방법
        * 1. throws로 위임
        * 2. try-catch로 처리
        * */

        et.checkEnoughMoney(10000, 50000);
        et.checkEnoughMoney(50000, 10000); // 예외발생지점

        // 예외발생으로 인해 출력이 안됨.
        System.out.println("프로그램을 종료합니다.");
    }
}
