package lecture.section01.enumtype;

public class Application {
    public static void main(String[] args) {

        Subjects subjects1 = Subjects.JAVA;
//        Subjects subjects2 = "다른 자료형은 넣을 수 없음";
        Subjects subjects2 = Subjects.HTML;
        Subjects subjects3 = Subjects.JAVA;

        if(subjects1 == subjects2) {
            System.out.println("두 과목은 같은 과목입니다.");
        } else {
            System.out.println("두 과목은 다른 과목입니다.");
        }

        System.out.println("(subjects1 == subjects3) = " + (subjects1 == subjects3));

        // Switch문에 enum 사용가능
        // 상수 이름만 작성해도 된다.
        switch (subjects2) {
            case JAVA :
            case MYSQL :
            case JDBC:
                System.out.println("백엔드입니다.");
                break;
            case HTML :
            case CSS :
            case JAVASCRIPT:
                System.out.println("프론트엔드입니다.");
                break;
        }

        printSubject(subjects3/*"JAVA"는 문자열이라 불가능*/);
    }

    // 컴파일 단계에서 잘못된 값을 막을 수 있음
    public static void printSubject(Subjects subjects) {
        System.out.println("선택한 과목 : " + subjects.name());
    }
}
