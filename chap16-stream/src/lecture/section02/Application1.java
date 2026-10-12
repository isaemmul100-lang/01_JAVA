package lecture.section02;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /*
         * Stream<T> filter(Predicate<? super T> predicate
         * 스트림에서 특정 데이터만 걸러내는 메소드
         * */

        IntStream intStream = IntStream.range(0, 10);

        // i가  짝수일 때 true
//        Predicate<Integer> predicate = (i) -> (i%2) == 0;
        intStream
                .filter((i) -> (i%2) == 0) // 짝수만 다음 stream으로 넘긴다 (filter : 조건이 true 일 경우에만 다음으로 넘김)
                .forEach(System.out::println);
    }
}
