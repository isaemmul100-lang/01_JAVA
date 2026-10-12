package lecture.caculator;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 생성자 호출
        Calculator calculator = new Calculator();

        // 사용자 입력 받기 위한 스캐너
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 계산기 프로그램 =====");

            System.out.print("연산자를 입력하세요 (+, /, 종료: exit) : ");
            try {
                // 사용자의 입력을 받고 앞뒤 공백제거 후 문자열 반환
                String operator = sc.nextLine().trim();

                if ("exit".equals(operator)) {
                    System.out.println("계산기를 종료합니다.");
                    break;
                }

                // 실수를 입력받는 메소드
                double firstNumber = inputNumber(sc, "첫번째 숫자를 입력하세요 : ");
                double secondNumber = inputNumber(sc, "두번째 숫자를 입력하세요 : ");
                double result = 0; // 선언, 초기화

                switch (operator) {
                    case "+" :
                        result = calculator.add(firstNumber, secondNumber);
                        break;
                    case "/" :
                        result = calculator.divide(firstNumber, secondNumber);
                        break;
                    default :
                        throw new CalculatorException(CalculatorErrorCode.INVALID_OPERATOR);
                }

                System.out.println("계산결과 : " + firstNumber + " " + operator + " " + secondNumber + " = " + result);

            } catch (CalculatorException e) {
                GlobalExceptionHandler.handle(e);
            }
        }

        sc.close();
    }

    // 실수를 입력받는 메소드
    private static double inputNumber(Scanner scanner, String message) {
        System.out.print(message);
        // 숫자를 문자열로 입력받음
        String input = scanner.nextLine().trim();

        try {
            return Double.parseDouble(input); // 사용자의 입력이 실수로 안될경우 예외발생! (ex.문자를 입력해서 바뀌지 않는 경우)
        } catch (NumberFormatException e) {
            throw new CalculatorException(CalculatorErrorCode.INVALID_NUMBER);
        }

    }
}
