package lecture.section01.intro;

// 함수적 인터페이스

@FunctionalInterface // 컴파일 시점에 람다식으로 쓸 수 있는 인터페이스인지 확인해주는 기능
public interface Calculator {

    // 추상메서드
    public int sumToNumber(int a, int b);

    // 람다식을 사용하기 위해서는 인터페이스 내부에 하나의 추상메소드만 있어야함.
    //    public void printNum(int a);

}
