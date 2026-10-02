package exercise.hard;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String fruit = sc.nextLine();

        switch (fruit) {
            case "사과" -> System.out.println("사과의 가격은 3000원입니다.");
            case "바나나" -> System.out.println("바나나의 가격은 3000원입니다.");
            case "복숭아" -> System.out.println("복숭아의 가격은 3000원입니다.");
            case "키위" -> System.out.println("키위의 가격은 3000원입니다.");
            default -> System.out.println("준비된 상품이 없습니다.");
        }
    }
}
