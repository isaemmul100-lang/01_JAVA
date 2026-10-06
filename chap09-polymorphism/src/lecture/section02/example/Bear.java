package lecture.section02.example;

public class Bear extends Animal{

    @Override
    public void eat() {
        System.out.println("곰이 풀을 뜯어 먹습니다..");
    }

    @Override
    public void run() {
        System.out.println("곰이 달려갑니다..");
    }

    @Override
    public void cry() {
        System.out.println("곰이 울음소리를 냅니다..");
    }
}
