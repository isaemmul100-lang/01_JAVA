package lecture.section02.extend.run;

import lecture.section02.extend.*;

public class Application2 {

    public static void main(String[] args) {
        /*
        * 와일드 카드 [ ? ]
        * <?> : 제한없음
        * <? extends TYPE> : 와일드카드의 상한 제한 (TYPE과 TYPE의 후손만 사용 가능)
        * <? super TYPE> : 와일드카드의 하한 제한 (TYPE과 TYPE의 부모로만 사용 가능)
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

        // anyType(RabbitFarm<?> farm)
        // 어떤 토끼든 생성이 가능
        Rabbit rabbit = new Rabbit();
        RabbitFarm rabbitFarm = new RabbitFarm(rabbit);
        wildCardFarm.anyType(rabbitFarm);
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        // extendsType(RabbitFarm<? extends Bunny> farm)
        // Bunny 또는 Bunny의 자식으로 만든 토끼만 가능
//        wildCardFarm.extendType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendType(new RabbitFarm<>(new DrunkenBunny()));

        // public void superType(RabbitFarm<? super Bunny> farm)
        // Bunny 또는 Bunny의 부모 타입만 가능
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
    }
}
