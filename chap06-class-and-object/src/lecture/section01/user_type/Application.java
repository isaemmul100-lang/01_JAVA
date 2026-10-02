package lecture.section01.user_type;

public class Application {

    public static void main(String[] args) {

        // 회원 데이터 관리
        /*
        * 자료형 변수명 = new 클래스명(); -> 인스턴스를 생성
        * */
        
        Member member = new Member();

        // null : 비어있는 값을 표현하기 위한 의미
        /*
        * 필드에 접근하기 위해서는 변수명.필드며으로 접근한다.
        * '.' : 참조연산자 -> 변수가 참고하고 있는 주소로 접근하는 의미를 가짐
        * */

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println("member.id = " + member.id);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);

        // 블록설정 후에 alt + j : 커서복사
        // 복사하고 싶은 줄에서 ctrl + d : 줄 복사
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby[0] = " + member.hobby[0]);

        System.out.println(member);
    }
}
