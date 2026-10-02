package exercise.hard;

public class Q3 {
    public static void main(String[] args) {

        // 얕은 복사
        int[] origin = {1, 2, 3};
        int[] shallow = origin;
        shallow[0] = 99;
        System.out.print("[얕은 복사] origin : ");
        print(origin);

        //깊은 복사
        int[] deep = new int[origin.length];
        /* 원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이 의미를 가진다. */
        System.arraycopy(origin, 0, deep, 0, origin.length);
        deep[0] = 0;
        System.out.print("[깊은 복사] origin : ");
        print(origin);
        System.out.print("[깊은 복사] deep : ");
        print(deep);
    }

    public static void print(int[] iarr) {

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}
