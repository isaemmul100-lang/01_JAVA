package lecture.section01.intro;

public class CalculatorImpl implements Calculator {

    // 추상메서드를 오버라이딩해서 완성
    @Override
    public int sumToNumber(int a, int b) {
        return a + b;
    }
}
