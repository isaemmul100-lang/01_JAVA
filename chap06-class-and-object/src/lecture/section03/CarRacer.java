package lecture.section03;

public class CarRacer {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    // 시동걸기
    public void startUp() {
        car.startup();
    }

    // 엑셀밟기
    public void stepAccelator() {
        car.go();
    }

    // 브레이크 밟기
    public void stepBreak() {
        car.stop();
    }

    // 시동끄기
    public void turnOff() {
        car.turnOff();
    }

}
