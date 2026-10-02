package exercise.hard;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.print("정수 5개를 입력하세요 : ");
        for(int i = 0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 1;i<nums.length;i++) {
            for(int j = 0;j<i;j++) {
                if(nums[i]<nums[j]) {
                    int temp;
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.print("정렬된 값 : ");
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
