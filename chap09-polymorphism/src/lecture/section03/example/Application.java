package lecture.section03.example;

public class Application {

    public static void main(String[] args) {

        BankTransferPaymentProcess bank = new BankTransferPaymentProcess();
        CreditCardPaymentProcess credit = new CreditCardPaymentProcess();

        OrderService orderService = new OrderService(credit);
        orderService.checkout(50000);
    }

}
