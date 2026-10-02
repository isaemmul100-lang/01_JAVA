package exercise.normal;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[2][3];

        System.out.println("배열 값을 입력하세요 : ");
        for(int i=0;i< nums.length;i++) {
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.println("배열의 값 : ");
        for(int i=0;i< nums.length;i++) {
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
