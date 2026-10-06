package lecture.section01.polymorphism;

public class Application1 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.cry();
        Tiger tiger = new Tiger();
        tiger.cry();
        tiger.bite();
        Rabbit rabbit = new Rabbit();
        rabbit.cry();


        /*
        * 동적 바인딩
        * - 컴파일 당시에는 해당 타입의 메소드를 가르키다가
        * - 런타임 당시 실제 가진 오버라이딩된 메소드로 바인이 바뀌어 동작하는 것
        * */

        System.out.println("=====================================");

        Animal a1 = new Tiger();
        a1.cry();
//        a1.bite(); 컴파일이 안됨 -> Animal 가르키고 있어니까
        Animal a2 = new Rabbit();
        a2.cry();

        // 부모 타입이 자식 타입으로 저장될 순 없음.
//        Tiger t1 = new Animal();

        // 레퍼런스타입이 Animal 이기 때문에, Rabbit과 Tiger가 가진 고유한 기능을 동작시키지 못한다.
//        a1.bite();
//        a2.jump();

        System.out.println("================== 형변환 ==================");

        ((Tiger) a1).bite();
        ((Rabbit) a2).jump();

        // 타입형변환을 잘못하는 경우 컴파일시에는 문제가 되지 않는데, 런타임시 Exception(예외) 가 발생한다.
//        ((Rabbit) a1).jump();

        System.out.println("instanceof 연산자 ================");
        System.out.println(" a1 이 Tiger 타인지 확인 : " +  (a1 instanceof Tiger));
        System.out.println(" a1 이 Animal 타인지 확인 : " +  (a1 instanceof Animal));
        System.out.println(" a1 이 Object 타인지 확인 : " +  (a1 instanceof Object));
        System.out.println(" a1 이 Rabbit 타인지 확인 : " +  (a1 instanceof Rabbit));

        if(a1 instanceof Tiger){
            ((Tiger)a1).bite();
        }

        /*
        * up-casting : 상위 타입으로 형변환 -> 안 써줘도 형변환이 가능
        * down-casting : 하위 타입으로 형변환 -> 명시를 해줘야함
        * */

        Animal animal1 = new Rabbit(); // up-casting
        Rabbit rabbit1 = (Rabbit) new Animal(); // down-casting
    }

}
