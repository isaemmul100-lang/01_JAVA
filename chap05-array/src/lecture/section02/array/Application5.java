package lecture.section02.array;

public class Application5 {

    public static void main(String[] args) {

        // 다차원 배열 : 2차원 상의 배열을 의미
        int[][] iarr;

        iarr = new int[3][];

        iarr[0] = new int[5];
        iarr[1] = new int[5];
        iarr[2] = new int[5];

        int[][] iarr2 = new int[3][5];

        System.out.println(iarr2[0][4]);

    }
}
