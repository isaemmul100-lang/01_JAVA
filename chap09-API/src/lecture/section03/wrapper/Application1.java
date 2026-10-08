package lecture.section03.wrapper;

public class Application1 {

    public static void main(String[] args) {
        /*
        * Wrapping Class
        * - 기본자료형을 객체로 감싸주는 클래스 (byte, short, int, long, float, double, boolean)
        * */

        int primitive = 20; // 기본자료형
        Integer wrapper = primitive; // Auto Boxing
        int result = wrapper; // Auto UnBoxing

        /*
        * 문자열을 기본 타입으로 변경할 때 사용
        * parse() : 문자열을 인자로 받아서 원하는 타입으로 변환
        * */

        int age = Integer.parseInt("20");
        Double height = Double.parseDouble("167.5");
        boolean active = Boolean.parseBoolean("true");

        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("active = " + active);

//        Integer.parseInt("20세"); // 숫자로 변경할 수 없다는 예외 발생

    }
}
