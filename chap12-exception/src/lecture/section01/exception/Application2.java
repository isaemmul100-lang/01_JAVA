package lecture.section01.exception;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        /*
        * 예외의 처리 방법
        * 1. throws로 위임
        * 2. try-catch로 처리
        * */

        try {
            et.checkEnoughMoney(50000, 10000); // 예외발생지점

            // 예외가 발생하게되면 바로 catch로 이동해 코드가 진행된다.
            System.out.println("checkEnoughMoney가 실행되었습니다.");
        } catch (Exception e) {
            // 예외가 발생했을 때 동작할 처리
            System.out.println("예외가 발생했습니다!");
        }

        // 예외가 try-catch문에서 처리가 되어
        // 출력이 되는 것을 확인할 수 있음.
        System.out.println("프로그램을 종료합니다.");
    }
}
