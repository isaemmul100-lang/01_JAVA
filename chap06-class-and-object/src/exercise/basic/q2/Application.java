package exercise.basic.q2;

public class Application {
    public static void main(String[] args) {

        Car car = new Car("스포츠카", 2000);

        System.out.println("모델명 : " + car.getModel());
        System.out.println("가격 : " + car.getPrice());

    }
}
