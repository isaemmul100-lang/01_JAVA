package lecture.section02.looping;

import java.util.Scanner;

public class B_while {

    /*
    초기식;

    while(조건식) {
        반복시키고 싶은 구문

        증감식;
    }
     */

    public void sampleWhile() {
        int i = 1; // 초기식

        Scanner sc = new Scanner(System.in);

        while (true /*조건식*/) {

            System.out.print("정수를 입력해 주세요 : ");
            int num = sc.nextInt();

//            i++; // 증감식

            if(num == 5) {
                break;
            }
            System.out.println("5가 아닙니다.");
        }
    }
}
