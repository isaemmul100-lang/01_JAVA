package exercise.sample.problem03;
import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Answer calculator = new Answer();

        System.out.print("첫 번째 정수 입력 : ");
        int firstNumber = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int secondNumber = sc.nextInt();

        int additionResult = calculator.add(firstNumber, secondNumber);
        int subtractionResult = calculator.subtract(firstNumber, secondNumber);
        int multiplicationResult = calculator.multiply(firstNumber, secondNumber);
        double divisionResult = calculator.divide(firstNumber, secondNumber);

        System.out.println("덧셈 결과 : " + additionResult);
        System.out.println("뺄셈 결과 : " + subtractionResult);
        System.out.println("곱셈 결과 : " + multiplicationResult);
        System.out.println("나눗셈 결과 : " + divisionResult);

    }

    public int add(int x, int y) {
        return x+y;
    }

    public int subtract(int x,int y) {
        return x-y;
    }

    public int multiply(int x, int y) {
        return x*y;
    }

    public double divide(int x, int y) {
        return (double)x/y;
    }
}
