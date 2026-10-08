package lecture.section02.extend.run;

import lecture.section02.extend.*;

public class Application1 {

    public static void main(String[] args) {
        /*
        * extends 키워드를 사용하면 특정 타입만 사용하도록 제한, 타입의 자식클래스만
        * */

        // extends Rabbit으로 성정했을 때
//        RabbitFarm<String> farm1 = new RabbitFarm<>();
//        RabbitFarm<Animal> farm2 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm3 = new RabbitFarm<>();

        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
    }
}
