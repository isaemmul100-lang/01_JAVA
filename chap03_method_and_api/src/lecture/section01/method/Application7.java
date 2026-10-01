package lecture.section01.method;

public class Application7 {

    public static void main(String[] args) {

        // 다른 클래스에서 작성한 static 메서드는 호출할 때 클래스명을 함께 작성해야한다.
        int result = Application6.sum(5, 6);
        System.out.println("result = " + result);


        Application6 app6 = new Application6();
        int result2 = app6.minus(5, 6);
        System.out.println("result2 = " + result2);
    }
}
