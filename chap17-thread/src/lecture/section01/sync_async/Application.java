package lecture.section01.sync_async;

public class Application {

    // I/O 대기 (기다리는 시간)이 있는 다운로드 같은 작업에서는 스레드를 늘리면(비동기로 처리하면) 효율이 좋다.
    // 내 컴퓨터에서 작업을 많이할 경우(연산작업) -> 코어 수가 정해져있어 스레드를 많이 늘려도 빨라지지 않음.
    public static void main(String[] args) throws InterruptedException {

        // 동기 ----------------------------------------
        System.out.println("===== 동기 방식 =====");

        // 시작시간을 측정
        long syncStart = System.currentTimeMillis(); // 현재 시간을 밀리초로 반환

        FileDownload.downloadSync("문서.pdf", 2000);
        FileDownload.downloadSync("사진.jpg", 1500);
        FileDownload.downloadSync("영상.mp4", 4000);

        long syncEnd = System.currentTimeMillis();

        long syncTotal = syncEnd - syncStart;
        System.out.println("동기 총 소요시간 = " + syncTotal);

        // 비동기 ---------------------------------------

        System.out.println("===== 비동기 방식 =====");

        // 시작시간을 측정
        long asyncStart = System.currentTimeMillis(); // 현재 시간을 밀리초로 반환

        Thread t1 = FileDownload.downloadAsync("문서.pdf", 2000);
        Thread t2 = FileDownload.downloadAsync("사진.jpg", 1500);
        Thread t3 = FileDownload.downloadAsync("영상.mp4", 4000);

        // 대기
        // join() : 스레드가 끝날 때까지 main 스레드를 대기시키는 메소드

        t1.join();
        t2.join();
        t3.join();

        long asyncEnd = System.currentTimeMillis();

        long asyncTotal = asyncEnd - asyncStart;
        System.out.println("비동기 총 소요시간 = " + asyncTotal);
    }
}
