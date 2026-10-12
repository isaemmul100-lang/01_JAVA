package lecture.section01.deadlock;

/*
 * 데드락 - 두 개 이상의 스레드가 서로 가진 락을 기다리면서 무한정 대기하는 상태
 *
 * 데드락의 발생조건
 * - 상호 배제 -> 한번에 하나의 공유자원만 사용 가능하다 - syncronization
 * - 점유 대기 -> 하나를 가지고 다른 공유자원을 기다리는
 * - 비선점 -> 강제로 다른 스레드가 점유한 공유자원을 뱃을 수 없는
 * - 순환대기 -> 서로 물려있는 상태
 * */

public class Application {

    // 공유자원
    static final Object 티셔츠 = new Object();
    static final Object 바지 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (티셔츠) {
                    System.out.println(Thread.currentThread().getName() + " : 티셔츠를 입었다.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " : 바지 찾으러 가는 중...");
                    synchronized (바지) {
                        System.out.println(Thread.currentThread().getName() + " : 바지를 입었다.");
                    }
                }
            }
        }, "형");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (바지) {
                    System.out.println(Thread.currentThread().getName() + " : 바지를 입었다.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " : 티셔츠 찾으러 가는 중...");
                    synchronized (티셔츠) {
                        System.out.println(Thread.currentThread().getName() + " : 티셔츠를 입었다.");
                    }
                }
            }
        }, "형");

        t1.start();
        t2.start();
    }
}
