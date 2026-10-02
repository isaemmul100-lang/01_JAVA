package exercise.hard;

import java.util.Scanner;

public class Answer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = (int) (Math.random()*100) + 1;
        int i = 1;

        while(true) {
            System.out.print("정수를 입력하세요 : ");
            int number = sc.nextInt();

            if(number > x) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else if (number < x) {
                System.out.println("입력하신 정수보다 작습니다.");
            } else {
                System.out.println("정답입니다. " + i + "회 만에 정답을 맞추셨습니다.");
                break;
            }
            i++;

        }
    }
}
