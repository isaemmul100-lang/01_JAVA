package lecture.section01.section01.extend;

import javax.sound.midi.Soundbank;

// 부모클래스
public class Car {
    /*필드영역*/
    // 달리는 중인지 상태
    private boolean runningStatus;

    public Car() {
        System.out.println("Car의 기본생성자가 호출되었습니다..");
    }
    /*메소드영역*/

    // 출력문으로 경적울리기
    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빵!빵!");
        } else {
            System.out.println("주행중이 아닐 경우에는 경적을 울릴 수 없습니다.");
        }
    }

    // 달리는 기능
    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    // 멈추는 기능
    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    // 현재 주행상태를 확인 할 수 있는 메서드
//    private boolean isRunning() { // 자식도 사용 불가능
    protected boolean isRunning() { // 자식에서는 사용 가능
        return runningStatus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "runningStatus=" + runningStatus +
                '}';
    }
}
