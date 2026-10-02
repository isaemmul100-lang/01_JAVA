package lecture.section02.encapsulation.problem1;

public class Monster {

    // 같은 클래스 안에서만 접근이 가능함
    private String name; // 몬스터의 이름
    private int hp; // 몬스터의 체력

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter : 필드값을 읽기 위한 메서드

    public int getHp() {
        return hp;
    }

    // setter : 필드값을 수정하기 위한 메서드
    // Monster 만든 인스턴스의 필드를 수정할 대는 setHp라고 하는 메서드로만 변경하자
    public void setHp(int num) {

        if(num > 0) {
            System.out.println("양수값이 입력되어 몬스터의 체력을 바꿉니다.");
            // this : 인스턴스가 생성되었을 때 자신의 주소를 가르키는 키워드
            this.hp = num;
        } else {
            System.out.println("음수값이 입력되어 체력을 0으로 저장합니다.");
            this.hp = 0;
        }



    }
}
