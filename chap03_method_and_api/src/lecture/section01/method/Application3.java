package lecture.section01.method;

public class Application3 {

    /*
    매개변수 (parameter) & 전달인자 (argument)
    */

    public static void main(String[] args) {

        Application3 app3 = new Application3();

        int num = 20;

        // 메소드에 매개변수가 있을때에는 인자를 넣어주어야함
        // 인자의 갯수는 매개변수의 갯수와 같아야함
        app3.printAge(num);

        // 매개변수의 타입에 맞는 리터럴값을 넣어야함
//        app3.printAge("20");

        // 매개변수는 지역변수이기에 메소드 밖에서는 사용할 수 없다.
//        System.out.println(age);


        String name = "lsm";
        int age = 20;
        char gen = '여';

        // 여러개의 매개변수를 가진 메소드를 호출할때는 매개변수의 순서에 따라 인자를 넣어주어야한다.
        // 같은 타입을 연속해서 넣을 때 주의
        app3.printUserInfo(name, age, gen);

        System.out.println("메인메소드 종료");
    }

    // 나이를 입력받으면 나이를 출력해주는 메소드
    // 매개변수는 메소드 안에서만 사용 가능하다
    public void printAge(/*매개변수*/ int age) {
        System.out.println("나이는 " + age + "입니다.");

        // 반환형이 void 일때는 return을 작성하지 않아도 compiler가 생성해준다.
//        return;
    }

    /*
    사용자의 이름, 나이, 성별을 받아서 출력하는 메소드
    메소드명 자유
    이름
     */

    public void printUserInfo(String name, int age, char gender) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
    }
}
