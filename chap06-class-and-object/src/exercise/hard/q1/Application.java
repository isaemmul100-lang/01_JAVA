package exercise.hard.q1;

public class Application {

    public static void main(String[] args) {

        Book book = new Book("자바의 정석", "남궁성", 30000);

        System.out.println("제목 : " + book.title);
        System.out.println("저자 : " + book.author);
        System.out.println("가격 : " + book.price);

    }

}
