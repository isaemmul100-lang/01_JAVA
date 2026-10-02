package exercise.hard;

import java.util.Scanner;

public class Answer2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("좋아하는 색을 한 단어로 입력하세요 : ");
        String col = sc.nextLine();

        System.out.println("");
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println("좋아하는 색 : " + col);
    }
}
