package lecture.section02.userexception.exception;

// MoneyNegativeException과 PriceNegativeException를 하나로 묶어서 처리하기 위해서
public class NegativeException extends Exception{
    public NegativeException() {
    }

    public NegativeException(String message) {
        super(message);
    }
}
