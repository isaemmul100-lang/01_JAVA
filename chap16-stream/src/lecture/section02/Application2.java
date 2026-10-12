package lecture.section02;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /*
         * Stream<R> map(Function<? super T, ? extends R> mapper)
         * 스트림에 들어있는 데이터를 특정 람다식을 통해 데이터를 가공하고
         * 새로운 스트림에 담아줌
         * */

        IntStream intStream = IntStream.range(0, 10);

        // 체이닝
        intStream
                .filter((i) -> (i % 2) == 0) // 짝수만 다음 stream으로 넘긴다 (filter : 조건이 true 일 경우에만 다음으로 넘김)
                .map(i -> i * 5)
                .forEach(System.out::println);

        IntStream intStream2 = IntStream.range(0, 10);

        intStream2
                .filter((i) -> (i % 2) == 0) // 짝수만 다음 stream으로 넘긴다 (filter : 조건이 true 일 경우에만 다음으로 넘김)
                .mapToDouble(i -> i * 5)
                .forEach(System.out::println);

    }
}
