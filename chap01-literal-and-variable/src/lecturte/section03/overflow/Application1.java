package lecturte.section03.overflow;

public class Application1 {

    public static void main(String[] args) {

        // 자료형마다 표현할 수 있는 범위가 있는데 이 범위를 넘어설 경우

        byte num1 = 127; // -128 ~ 127

        // 오버플로우
        System.out.println("증가 전 : " + num1);
        num1++; // num1 = num1 + 1의 의미 -> 128
        System.out.println("증가 후 : " + num1); // -128

        int inum = 1000000;
        long lnum = 700000;

        // 자바의 정수형 타임 기본은 int
        long longMulti = inum * lnum;

        System.out.println("ling 타입으로 출력 " + longMulti);

    }
}
