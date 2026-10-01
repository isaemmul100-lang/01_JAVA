package lecture.section01.method;

public class Application5 {

    public static void main(String[] args) {

        Application5 app5 = new Application5();

        int result = app5.plus(5, 7);
        System.out.println("result = " + result);
        System.out.println("두수를 더한 값 : " + app5.plus(5, 7));
        System.out.println("두수를 뺀 값 : " + app5.minus(5, 7));
        System.out.println("두수를 곱한 값 : " + app5.multi(5, 7));
        System.out.println("두수를 나눈 값 : " + app5.divide(10, 2));
    }


    // 두수를 받아 더하는 메소드
    public int plus(int x, int y) {
        return x + y;
    }

    // 두수를 받아 빼는 메소드
    public int minus(int x, int y) {
        return x - y;
    }

    // 두수를 받아 곱하는 메소드
    public int multi(int x, int y) {
        return x * y;
    }

    // 두수를 받아 나누는(몫) 메소드
    public int divide(int x, int y) {
        return x / y;
    }
}
