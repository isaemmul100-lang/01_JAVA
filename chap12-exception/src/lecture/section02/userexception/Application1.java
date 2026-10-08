package lecture.section02.userexception;

import lecture.section02.userexception.exception.*;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try/*(외부 자원을 활용하는 객체)*/ {
            et.checkEnoughMoney(1000, 100);
            /*
            * Catch 예외 상활별로 작성 할 수 있다.
            * - 더 상세한 예외를 상단에 작성해주어야한다.
            * ex) 밑에 코드에서 상세한 코드는 MoneyNegativeException, PriceNegativeException 이기에 NegativeException가 맨 위로 가면 밑에 코드가 상관 없게 되기때문
            * */
        } catch (MoneyNegativeException e) {
            System.out.println("(Application1) MoneyNegative Exception 발생!!");
            System.out.println(e.getMessage());
        } catch (PriceNegativeException e) {
            System.out.println("(Application1) PriceNegative Exception 발생!!");
            System.out.println(e.getMessage());
        } catch (NegativeException e) {
            System.out.println("(Application1) Negative Exception 발생!!");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("(Application1) NotEnoughMoney Exception 발생!!");
            System.out.println(e.getMessage());
        } finally {
            // 예외와 상관없이 동작할 내용
            System.out.println("finally 블럭의 내용이 동작함!");
        }

        System.out.println("프로그램을 종료함");
    }
}
