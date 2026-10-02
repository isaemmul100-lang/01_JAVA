package exercise.hard;

import java.util.Scanner;

public class Answer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();

        sc.nextLine();


        if(num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            System.out.print("연산 기호(+, -, *, /) : ");
            String op = sc.nextLine();

            switch (op) {
                case "+" ->
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                case "-" ->
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                case "*" ->
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                case "/" ->
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                default ->
                        System.out.println("지원하지 않는 연산입니다.");
            }
        }
    }
}
