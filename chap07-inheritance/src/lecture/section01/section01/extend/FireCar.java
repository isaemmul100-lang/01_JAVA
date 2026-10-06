package lecture.section01.section01.extend;

public class FireCar extends Car{

    public FireCar() {

        /*
        * super : 부모의 주소를 의미
        * super()는 자식 생성자의 가장 상단에 있어야 한다.
        * */
        super(); // 부모의 생성자를 가장 먼저 호출

        System.out.println("FireCar의 기본생성자 호출...");
    }

    /*메소드*/

    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 =--->");
    }

    /*오버라이딩*/
    // @Override : 부모 클래스의 메서드를 자식에서 재작성했다는 의미
    @Override
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빠아아아아아아아아앙 ~~ !"); // 코드를 수정
        } else {
            System.out.println("주행중이 아닐 경우에는 경적을 울릴 수 없습니다.");
        }
    }


}
