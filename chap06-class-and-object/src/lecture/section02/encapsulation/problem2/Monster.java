package lecture.section02.encapsulation.problem2;

public class Monster {

    private String kind; //몬스터의 종
    private int hp; // 몬스터의 체력

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}