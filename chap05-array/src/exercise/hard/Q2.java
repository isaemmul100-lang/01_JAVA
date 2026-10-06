package exercise.hard;

import java.util.Scanner;

/* Q2. 3x3 크기의 정수형 가변 배열을 선언하고 값을 입력받아 저장한 후, 각 행의 합계를 출력하세요.
 *
 * -- 입력 예시 --
 * 배열 값을 입력하세요:
 * 1 2
 * 3 4 5
 * 6
 *
 * -- 출력 예시 --
 * 행 1의 합: 3
 * 행 2의 합: 12
 * 행 3의 합: 6
 * */

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[3][];
        int sum = 0;

//        System.out.println("배열 값을 입력하세요 : ");
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) { // 문제점 주소를 관리하는 배열의 각 인덱스 마다 배열을 할당하지 않음 하지만 가변배열으로 사용자가 치는 만큼만 만들어함
//                nums[i][j] = sc.nextInt();
//            }
//        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("배열 값을 입력하세요 : ");
            int num = sc.nextInt();
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j+1] = num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print("행 " + i + "의 합 : ");
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
            System.out.println(sum);
        }



    }
}
