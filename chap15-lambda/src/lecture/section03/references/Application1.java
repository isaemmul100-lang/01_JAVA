package lecture.section03.references;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application1 {
    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");

        // stream : 배열이나 컬렉션을 좀 더 잘 다르기 위한 문법
        // Function<? super T, ? extends R> mapper
        // 리스트의 모든 요소를 대문자로 만드는 코드
        Function<String, String> function = (str) -> str.toUpperCase();

        /*
        * 메소드 참조
        * 객체명::메서드명
        * 클래스::정적메소드
        * */
        subjects.stream().map(String::toUpperCase).forEach(System.out::println);

        subjects.forEach(Example::printName);

    }
}
