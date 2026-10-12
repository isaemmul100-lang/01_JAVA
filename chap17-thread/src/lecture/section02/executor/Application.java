package lecture.section02.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    public static void main(String[] args) throws Exception {

        /*
         * 스레풀 (Thread Pool)
         * - 스레드를 미리 정해진 수만큼 만들어 두고 재사용
         * - 작업들을 대기열(큐)에 쌓고, 일을 안 하고 있는 스레드가 하나씩 처리한다.
         * */

        // 스레드를 3개 가지고 있는 스레드풀
        ExecutorService executor = Executors.newFixedThreadPool(3);

        System.out.println("=== 일감 5개 제출 (일꾼은 3명) ===");

        for (int i = 1; i <= 9999; i++) {

            int taskNo = i;

            executor.submit(() -> {
                System.out.println("[" + Thread.currentThread().getName() + "] " + taskNo + "번 일 처리");
                sleep(1000);
            });
        }
    }

    // 대기시간
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
