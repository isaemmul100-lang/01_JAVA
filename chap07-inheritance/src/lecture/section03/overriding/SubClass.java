package lecture.section03.overriding;

// 자식클래스
public class SubClass extends SuperClass {

    /*
     * 오버라이딩 성립요건
     * 1. 메소드의 이름이 동일해야한다.
     * 2. 메소드의 리턴 타입이 동일해야한다.
     * 3. 매개변수의 타입, 갯수, 순서가 동일해야한다.
     * 4. 접근이 가능해야 오버라이딩이 가능하다. (접근제어자가 부모 메서드가 같거나 더 넓어야함)
     * 5. final 키워드가 사용된 메서드는 오버라이딩이 불가하다.
     * */

//    @Override
//    public void method2(int num) {
//
//    }

//    @Override
//    public int method(int num) {
//        return 5;
//    }

//    @Override
//    public void method(String num){
//
//    }

    // 메소드 이름, 리턴타입, 매개변수의 갯수, 타입, 순서가 일치해야함
    @Override
    public void method(int num) {}

    // private 메서드는 접근이 불가하여 오버라이딩을 할 수 없다.
//    @Override
//    public void privateMethod() {}

    // final로 선언된 메서드는 오버라이딩 불가
//    @Override
//    public final void finalMethod() {}

    // 부모 메서드의 접근제어자와 같거나 더 넓은 범위로 오버라이딩 해야함.


//    @Override
//    protected void protectedMethod() {}

//    @Override
//    public void protectedMethod() {}
    
}
