package exercise.basic.q1;

public class Application {

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "홍길동";
        person.age = 20;

        System.out.println("이름 : " + person.name);
        System.out.println("나이 : " + person.age);
    }
}
