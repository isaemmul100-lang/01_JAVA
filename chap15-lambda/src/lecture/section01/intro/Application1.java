package lecture.section01.intro;

public class Application1 {
    public static void main(String[] args) {
        /*
         * 람다 표현식 (메소드를 표현하는 방법)
         * (매개변수, ...) -> { ... }
         * -> 매개변수의 타입은 추론이 가능해서 명시적으로 작성하지 않아도 됨!
         * -> 매개변수가 한개만 있을 때는 ()를 생략 가능 ex) str -> { 실행문 }
         * -> 실행문이 한줄일 경우 {}도 생략 가능 ex) str -> 실행문
         * */

        // 1. 인터페이스를 구현한 구현체(클래스)를 이용한 방식_클래스를 하나 만들어야해서 코드가 무거워짐
        CalculatorImpl calculator = new CalculatorImpl();
        System.out.println(calculator.sumToNumber(5, 4));

        // 2. 익명클래스_코드 가독성이 떨어짐
        // 클래스의 선언부가 없는 익명클래스
        Calculator calculator2 = new Calculator() {
            @Override
            public int sumToNumber(int a, int b) {
                return a + b;
            }
        };

        // 3. 람다식_위 두개의 단점을 보완함(메서드가 있어야함)
        Calculator calculator3 = (x, y) -> x + y; // 메서드 선언
        Calculator calculator4 = (x, y) -> {return x + y;}; // 메서드 선언
        System.out.println("람다식 동작");
        System.out.println(calculator3.sumToNumber(5,4));
    }
}
