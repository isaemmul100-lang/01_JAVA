package lecture.section01.generic;

// 제네릭 설정은 클래스명 옆에 다이아몬드 연산자 (꺽쇠)
// 연산자 내부에 작성하는 영문자는 대문자 (관례)
public class GenericTest<T> {

    private T value;

    public GenericTest(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
