package lecture.section01.increment;

public class Application {

    public static void main(String[] args) {

        /*
        증감연산자
        - 변수의 값을 1 증가시키거나 1 감소시키는 연산자
         */

        int num = 20;
        System.out.println("num = " + num);

//        num++;
        num--;

        System.out.println("num = " + num);

        /*
        전위 연산자(++num) : 값을 먼저 증가시키고 증가된 값을 사용
        후위 연산자(num++) : 기존 값을 먼저 사용하고 변수의 값을 증가시킨다.
         */

        int firstNum = 20;
        int postResult = firstNum++ * 3; // 후위연산

        System.out.println("firstNum = " + firstNum);
        System.out.println("postResult = " + postResult);

        int lastNum = 20;
        int Result = ++lastNum * 3; // 전위연산

        System.out.println("lastNum = " + lastNum);
        System.out.println("Result = " + Result);

    }

}
