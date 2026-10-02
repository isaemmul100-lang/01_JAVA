package lecture.section02.encapsulation.problem2;

public class Application2 {


    public static void main(String[] args) {

        Monster monster1 = new Monster(); // 인스턴스화

        // 필드에 직접 접근한다.
        monster1.setKind("두치"); // private로 선언되어 직접 접근을 할 수 없음
        monster1.setHp(200);

        Monster monster2 = new Monster(); // 인스턴스화

        // 필드에 직접 접근한다.
        monster2.setKind("두치"); // private로 선언되어 직접 접근을 할 수 없음
        monster2.setHp(200);

        Monster monster3 = new Monster(); // 인스턴스화

        // 필드에 직접 접근한다.
        monster3.setKind("두치"); // private로 선언되어 직접 접근을 할 수 없음
        monster3.setHp(200);

    }

}
