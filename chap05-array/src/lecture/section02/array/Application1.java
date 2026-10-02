package lecture.section02.array;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 배열
         * - 동일한 자료형의 묶음
         * */

        // 배열의 선언 및 할당
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // 하나의 이름으로 관리되는 "연속된" 메모리 공간
        // 인덱스로 값을 찾아 올 수 있다.
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);
        System.out.println("arr[3] = " + arr[3]);
        System.out.println("arr[4] = " + arr[4]);

        for (int i = 0; i < 5; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
}
