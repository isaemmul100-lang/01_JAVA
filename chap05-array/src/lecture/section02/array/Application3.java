package lecture.section02.array;

public class Application3 {
    public static void main(String[] args) {

        // 초기화 블록
        // 기본값 이외의 값으로 초기화 하고 싶을 때 {}블럭 사용
        int[] iarr  = {1, 4, 6, 7, 8};
        int[] iarr2  = new int[] {1, 4, 6, 7, 8};

        for (int i = 0; i < iarr.length; i++) {
            System.out.println("i = " + i + " : " + iarr[i]);
        }

    }
}
