package lecture.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        /*
        * Queue
        * - 선형 메모리 공간에 데이터를 저장하는 선입선출(FIFO) 방식의 자료구조
        * */

        Queue<String> que = new LinkedList<>();

        // 데이터를 삽입
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que = " + que);

        /*
        * peek() : 큐의 가장 앞에 있는 요소를 반환
        * poll() : 큐의 가장 앞에 있는 요소를 반환하고 제거
        * */

        System.out.println("que.peek() = " + que.peek()); // first
        System.out.println("que.peek() = " + que.peek()); // first
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll()); // null
    }
}
