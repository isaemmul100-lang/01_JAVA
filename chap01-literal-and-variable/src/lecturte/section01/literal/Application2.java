package lecturte.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        // 정수끼리의 연산
        // 정수끼리 연산하면 정수의 결과가 나온다!
        System.out.println(12 + 34);
        System.out.println(12 - 34);
        System.out.println(12 * 34); // 곱셈
        System.out.println(12 / 34); // 나눈 몫
        System.out.println(12 % 34); // 나머지

        // 실수가 포함된 연산
        System.out.println("=========== 실수가 포함된 연산 ===========");
        System.out.println(10 / 4.0); // 실수의 결과가 나옴
        System.out.println(0.1 + 0.2); // 0.3
        // 부동소수점
        // 10진소수를 2진 소수로 표현할 수 없는 경우가 있음
        // 소수를 가장 가까운(근사값) 저장해서 계산하게 됨 -> 오차가 생길 수 있음.

        //문자 연산
        System.out.println("=========== 문자 연산 ===========");
        System.out.println('a' + 'b');
        System.out.println('a' + 1);

        //문자열 연산
        System.out.println("=========== 문자열 연산 ===========");
        System.out.println("hello" + "world"); // helloworld
        System.out.println("hello" + 100); // hello100
        System.out.println("123" + "100"); // 123100
        System.out.println("123" + true); // 123true
//        System.out.println(false + true); boolean 끼리는 연산 안됨
    }
}
