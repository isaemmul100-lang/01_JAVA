package lecture.section02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {
        
        /*
        * Stream<T> sorted();
        * Stream<T> sorted(Comparator<? super T> comparator);
        * - sorted() 인자가 없으면 오름차순으로 정렬된다.
        * */

        // int 오름차순
        List<Integer> integerList = IntStream.of(5,2,4,6,16,789,2345)
                .boxed() // 박싱 : 기본타입 -> 참조타입으로 변경
                .sorted()
                .toList(); // 리스트 형으로 변경 = .collect(Collectors.toList());

        System.out.println("integerList = " + integerList);

        // int 내림차순
        List<Integer> integerList2 = IntStream.of(5,2,4,6,16,789,2345)
                .boxed() // 박싱 : 기본타입 -> 참조타입으로 변경
                .sorted((s1, s2) -> s2.compareTo(s1))
                .toList(); // 리스트 형으로 변경 = .collect(Collectors.toList());

        System.out.println("integerList2 = " + integerList2);

        // compareTo : 문자열
        List<String> stringList = Arrays.asList("java", "sql", "mybatis", "jdbc", "spring", "java", "mybatis", "sql", "sql");

        List<String> strList = stringList.stream()
                .sorted((s1, s2) -> s1.compareTo(s2)) // 내림차순
                .toList(); // 리스트 형으로 변경 = .collect(Collectors.toList());

        System.out.println("strList = " + strList);

        List<String> strList2 = stringList.stream()
                .peek((str) -> System.out.println("[원본]str = " + str))
                .sorted((s1, s2) -> s1.compareTo(s2)) // 내림차순
                .peek((str) -> System.out.println("[sorted 다음]str = " + str)) // 중간 처리 과정을 보고 싶을 때 사용
                .distinct() // 중복을 제거함
                .peek((str) -> System.out.println("[distinct 다음]str = " + str))
                .limit(3) // 상위 N개 추출
                .peek((str) -> System.out.println("[limit 다음]str = " + str))
                .toList(); // 리스트 형으로 변경 = .collect(Collectors.toList());

        System.out.println("strList2 = " + strList2);
    }
}
