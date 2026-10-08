package lecture.section02.userexception.exception;

public class NotEnoughMoneyException extends Throwable {
    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
