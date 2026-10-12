package lecture.section02.grammar;

public class Application {

    public static void main(String[] args) {

        // Enum 타입을 처음 사용하면
        // 모든 상수가 생성자의 선언 순서대로 한번씩 호출되다.
        UserRole1 admin = UserRole1.ADMIN;

        System.out.println("enum 상수 : " + admin);
        System.out.println("enum 상수 : " + admin.name());
        // 메소드를 가질 수 있다.
        System.out.println("enum 상수 : " + admin.getNameToLowerCase());

        // Values() : 모든 상수를 순서대로 담은 배열을 반환
        for (UserRole1 role : UserRole1.values()) {
            System.out.println(role.name());
        }

        // enum은 상수별 데이터를 저장하는 필드와 생성자, 메서드를 가질 수 있다.
        for (UserRole2 role : UserRole2.values()) {
            System.out.println(role.name() + " - " +  role.getDescription());
        }
    }
}
