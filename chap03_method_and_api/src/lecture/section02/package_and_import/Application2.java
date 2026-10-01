package lecture.section02.package_and_import;
// 이 클래스를 가져오겠다
import lecture.section01.method.Calculator;
// import 다른 클래스의 정보를 가져오겠다.
import static lecture.section01.method.Calculator.sum;

/*
패키지
- 서로 관련있는 클래스 등을 모아 하나의 그룹으로 구성하는 것을 의미
 */

public class Application2 {

    public static void main(String[] args) {

        int result = sum(10, 10); // 바로사용가능
        System.out.println("result = " + result);

        // 다른 클래스의 메소드 사용하기
        Calculator calculator = new Calculator();
        int result2 = calculator.minus(10, 5);
        System.out.println("result2 = " + result2);

    }

}
