package lecture.section04.exercise;

public class Application {

    public static void main(String[] args) {
        /*
        * Firecar와 RacingCar는 앞으로 갈 수 있다. (go())
        *
        * Firecar와 RacingCar는 멈출 수 있다. (stop())
        * */

        FireCar fireCar = new FireCar();
        RacingCar racingCar = new RacingCar();

        fireCar.go();
        racingCar.go();
        fireCar.horn();
        fireCar.stop();
        racingCar.stop();

    }

}
