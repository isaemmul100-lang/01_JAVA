package exercise.sample.problem01;

public class Answer {

    public static void main(String[] args) {

        System.out.println("출고 처리 시작");

        Answer orderManager = new Answer();

        orderManager.verifyPayment();
        orderManager.packOrder();
        orderManager.handOverToCourier();

        System.out.println("출고 처리 종료");
    }

    public void verifyPayment() {
        System.out.println("결제를 확인했습니다.");
    }

    public void packOrder() {
        System.out.println("상품 포장을 완료했습니다.");
    }

    public void handOverToCourier() {
        System.out.println("택배사에 상품을 인계했습니다.");
    }
}
