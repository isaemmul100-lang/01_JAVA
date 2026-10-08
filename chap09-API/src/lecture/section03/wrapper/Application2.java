package lecture.section03.wrapper;

public class Application2 {

    public static void main(String[] args) {
        // 기본타입 -> 문자열
        // valueOf : 인자로 받은 기본자료형의 값을 문자열로 바꾸어준다. (String 에 있는 정적메소드)
        // toString : Wrapping Class에 있는 변환 메서드

        int num = 10;
        String strNum2 = String.valueOf(10); // 변환
        String decimal = Double.toString(3.14); // 변환
//        String strNum = num + "";
//        System.out.println("strNum = " + strNum);
    }
}
