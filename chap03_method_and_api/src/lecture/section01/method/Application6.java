package lecture.section01.method;

public class Application6 {

    // static 메소드 : 객체를 따로 만들지 않아도 메소드 자체를 사용 할 수 있다.
    public static void main(String[] args) {

        // static 메소드를 호출하는 방법
        //클래스명.메소드명()
        System.out.println(Application6.sum(1,2)); // 정석

        // 동일한 클래스 내에 작성된 static 메서드는 클래스명 생량이 가능하다.
        System.out.println(sum(1,2));

        System.out.println(); // 클래스명.out.메소드명()
    }

    public static int sum(int x, int y) {
        return x+y;
    }

    public int minus(int x, int y) {
        return x-y;
    }
}
