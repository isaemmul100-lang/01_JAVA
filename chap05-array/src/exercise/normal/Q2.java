package exercise.normal;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        int[] copynums = nums;

        System.out.print("첫 번째 배열 값을 입력하세요 : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("두 번째 배열 값 (복사 후) : ");
        for (int i = 0; i < copynums.length; i++) {
            System.out.print(copynums[i] + " ");
        }


    }
}
