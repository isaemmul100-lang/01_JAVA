package lecture.section02.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application0 {

    /*
     * 표준 함수적 인터페이스
     * Runnable : 매개변수 : X, 이런값 : X : run()
     * Consumer : 매개변수 O, 리턴값 X : accept()
     * Supplier : 매개변수 X, 리턴값 O : get()
     * Function : 매개변수 O, 리턴값 O : apply()
     * Operator : 매개변수 O, 리턴값 O : apply() * 매개변수와 Return 타입이 동일
     * Predicate: 매개변수 O, 리턴값 O : test() * Boolean값을 리턴
     * */
    public static void main(String[] args) {

        /*
         * int : 반환형
         * int 매개변수 2
         * */
        //Operator : 매개변수 O, 리턴값 O : apply() * 매개변수와 Return 타입이 동일
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(5, 4));

        // Runnable
        // Runnable : 매개변수 : X, 이런값 : X : run()
        Runnable runnable = () -> System.out.println("runnable 실행");
        runnable.run();

        // Consumer : 매개변수 O, 리턴값 X : accept()
        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept("Consumer 실행");

        // Supplier : 매개변수 X, 리턴값 O : get()
        Supplier<LocalDateTime> supplier = () -> {
            return LocalDateTime.now();
        };

        Supplier<LocalDateTime> supplier2 = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        // Function<반환형, 매개변수> : 매개변수 O, 리턴값 O : apply()
        Function<String, Integer> function = (str) -> {
            return Integer.parseInt(str);
        };
        function.apply("50");

        // Predicate: 매개변수 O, 리턴값 O : test() * Boolean값을 리턴
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(6));
    }
}
